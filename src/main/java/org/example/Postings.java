package org.example;

import java.io.IOException;
import java.util.List;

public interface Postings {

    List<Posting> postings(Filter filter) throws IOException;

}
