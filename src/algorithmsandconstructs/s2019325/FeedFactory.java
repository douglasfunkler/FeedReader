package algorithmsandconstructs.s2019325;

import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class FeedFactory implements FeedFactoryInterface {

    @Override
    public FeedInterface createFeed(BufferedReader in) throws IOException {

        
        return null;
    }
}
