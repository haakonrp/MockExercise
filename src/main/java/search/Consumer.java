package search;

import java.util.List;

/**
 * Created by asdfRig on 24.10.2016.
 */
public interface Consumer {
    void indexPage(String url);
    List<String> search(String word);
}
