package search;

/**
 * Created by asdfRig on 24.10.2016.
 */
public class UrlPageReaderInjector implements PageReaderInjector {

    @Override
    public Consumer getConsumer() {
        return new SearchEngine(new UrlPageReader());
    }
}
