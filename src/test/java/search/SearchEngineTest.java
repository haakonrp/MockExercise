package search;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nilstes
 */
public class SearchEngineTest {
    
    public SearchEngineTest() {
    }

    public static void main(String[] args) {
        String url = "www.google.com";
        String keyword = "search";
        PageReaderInjector injector = null;
        Consumer app = null;

        //test
        injector = new UrlPageReaderInjector();
        app = injector.getConsumer();
        app.search(keyword);
        app.indexPage(url);
    }
    
}
