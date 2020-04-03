package algorithmsandconstructs.s2019325;

import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class FeedFactory implements FeedFactoryInterface {

    Feed feed = new Feed();
    FeedItem feedItem = null;

    @Override
    public FeedInterface createFeed(BufferedReader in) throws IOException {

        String title = null;
        String content = null;
        while (in == null) {
            try {
                title = in.readLine();
                content = in.readLine();

            } catch (InputMismatchException im) {
                System.out.println("Information type doesn't match requirements: ");
            }
            feedItem = new FeedItem(title, content);
            feed.addItem(feedItem);
        }
        return feed;
    }
}
