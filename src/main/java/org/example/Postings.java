package org.example;

import java.io.IOException;
import java.util.List;

public interface Postings {

    List<Posting> findPostings(Filter filter) throws IOException;

}
