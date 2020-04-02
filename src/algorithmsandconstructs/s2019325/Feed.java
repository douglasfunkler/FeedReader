package algorithmsandconstructs.s2019325;

import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Feed implements FeedInterface {

    @Override
    public void addItem(FeedItem item) {
        ArrayList<FeedItem> arrayList = new ArrayList<>();
        //arrayList.
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
