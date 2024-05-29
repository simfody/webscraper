package ru.simfody.webscraper.handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.springframework.stereotype.Component;
import ru.simfody.webscraper.detail.ScraperTask;
import ru.simfody.webscraper.dto.HackerNewsItem;

import java.util.List;

// 28.05.2024
@Component("scraperTaskQueueListHandler")
public class ScraperTaskQueueListHandler {

    public boolean studyScraper(List<ScraperTask> stQueueList, List<ScraperTask> stLogList) {
        String baseUrl = "https://news.ycombinator.com/" ;
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        try {
            HtmlPage page = client.getPage(baseUrl);
            List<HtmlElement> itemList =  page.getByXPath("//tr[@class='athing']");
            if(itemList.isEmpty()){
                System.out.println("No item found");
            }else{
                for(HtmlElement htmlItem : itemList){
                    int position = Integer.parseInt(
                            ((HtmlElement) htmlItem.getFirstByXPath("./td/span"))
                                    .asNormalizedText()
                                    .replace(".", ""));
                    int id = Integer.parseInt(htmlItem.getAttribute("id"));
                    String title =  ((HtmlElement) htmlItem
                            .getFirstByXPath("./td[not(@valign='top')][@class='title']"))
                            .asNormalizedText();
String url = "url нету";
/*                    String url = ((HtmlAnchor) htmlItem
                            .getFirstByXPath("./td[not(@valign='top')][@class='title']/a"))
                            .getHrefAttribute();*/
String author = "author нету";
//                    String author =  ((HtmlElement) htmlItem
//                            .getFirstByXPath("./following-sibling::tr/td[@class='subtext']/a[@class='hnuser']"))
//                            .asNormalizedText();
int score = -1;
//                    int score = Integer.parseInt(
//                            ((HtmlElement) htmlItem
//                                    .getFirstByXPath("./following-sibling::tr/td[@class='subtext']/span[@class='score']"))
//                                    .asNormalizedText().replace(" points", ""));

                    HackerNewsItem hnItem = new HackerNewsItem(title, url, author, score, position, id);

                    ObjectMapper mapper = new ObjectMapper();
                    String jsonString = mapper.writeValueAsString(hnItem) ;

                    System.out.println(jsonString);
                }
            }
        } catch(Exception e){
                e.printStackTrace();
            }
       return false;
    }
}
