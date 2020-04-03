package algorithmsandconstructs.s2019325;

import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

import java.util.ArrayList;
import java.util.Collection;

public class Feed implements FeedInterface {

    ArrayList<FeedItem> arrayList = new ArrayList<FeedItem>();

    @Override
    public void addItem(FeedItem item) {
        arrayList.add(item);
    }

    @Override
    public Collection<String> listTitles() {
        return null;
    }

    @Override
    public FeedItem getItem(String title) {
        return null;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public Collection<FeedItem> findItems(String keyword) {
        return null;
    }
}
