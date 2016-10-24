package search;

import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by asdfRig on 24.10.2016.
 */
public class SearchEngineJUnitTest {
    private PageReaderInjector injector;

    @Before
    public void setUp() {
        injector = new PageReaderInjector() {
            @Override
            public Consumer getConsumer() {
                return new SearchEngine(new PageReader() {
                    @Override
                    public String[] readPage(String url) {
                        System.out.println("Mock Message Service implementation");
                        return new String[0];
                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.indexPage("www.google.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}
