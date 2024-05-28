package ru.simfody.webscraper.handlers;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.springframework.stereotype.Component;
import ru.simfody.webscraper.detail.ScraperLog;
import ru.simfody.webscraper.detail.ScraperTask;

import java.util.List;

// 28.05.2024
@Component("scraperTaskQueueListHandler")
public class ScraperTaskQueueListHandler {

    public boolean studyScraper(List<ScraperTask> scraperTaskQueueList, List<ScraperTask> scraperTaskLogList) {
        String baseUrl = "https://news.ycombinator.com/" ;
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        try {
            HtmlPage page = client.getPage(baseUrl);
            System.out.println(page.asXml());
        } catch(Exception e){
                e.printStackTrace();
            }
       return false;
    }
}
