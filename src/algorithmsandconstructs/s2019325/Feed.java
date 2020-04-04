package algorithmsandconstructs.s2019325;

import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

import java.util.ArrayList;
import java.util.Collection;

public class Feed implements FeedInterface {

    ArrayList<FeedItem> arrayList = new ArrayList<FeedItem>();
    FeedItem f = new FeedItem(null, null);

    @Override
    public void addItem(FeedItem item) {
        arrayList.add(item);
    }

    @Override
    public Collection<String> listTitles() {

        Collection titles = new ArrayList<String>();
        f.getTitle();
        titles.add(String.valueOf(f));
        return titles;
    }

    @Override
    public FeedItem getItem(String title) {
        title = f.getTitle();
        Object obj = title;
        return (FeedItem) obj;
    }

    @Override
    public int numItems() {
        int number = arrayList.size();
        return number;
    }

    @Override
    public Collection<FeedItem> findItems(String keyword) {
        Collection key = new ArrayList<String>();
        key.add(keyword);
        return key;
    }
}
