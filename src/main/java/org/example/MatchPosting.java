package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatchPosting implements Postings{

    @Override
    public List<Posting> findPostings(Filter filter) throws IOException {
        List<Posting> postingList = Util.getPostings();
        List<Posting> matchPostings = new ArrayList<>();

        Posting p = new PostingImpl();
        p.setPublicationType(filter.getPublicationType());
        p.setOperationType(filter.getOperationType());
        p.setViewed(filter.getViewed());
        p.setContacted(filter.getContacted());
        p.setHasWhatsapp(filter.getHasWhatsapp());
        p.setFavorite(filter.getFavorite());

        for(int i = 0; i< postingList.size(); i++){
            Posting postingActual = postingList.get(i);
            if(p.equals(postingActual)){
                matchPostings.add(postingActual);
            }
        }

        return matchPostings;
    }
}
