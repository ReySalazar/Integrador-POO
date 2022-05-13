package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        Posting p1 = new PostingImpl(1L,"Super Remate", "La casa hot", "Vedia 4543", "www.foto.jpg", true, new FeatureImpl(235.0, 2, 4, 2, 2), true, true, true, false, PublicationType.CLASIFFIED, OperationType.ALQUILER,CategoryListing.PARTICULAR, new PriceImpl(450000.0, 30000.0, 10.0), new PublisherImpl());
//        Posting p2 = new PostingImpl(2L,"Mansión", "Hogar dulce hogar", "Palpa 2400, CABA", "www.foto.jpg", true, new FeatureImpl(235.0, 2, 4, 2, 2), true, true, true, false, PublicationType.CLASIFFIED, OperationType.ALQUILER,CategoryListing.PARTICULAR, new PriceImpl(450000.0, 30000.0, 10.0), new PublisherImpl());
//        Posting p3 = new PostingImpl(3L,"El sin esquinas", "Home swett home", "Moldes 2536, Mendoza", "www.foto.jpg", true, new FeatureImpl(235.0, 2, 4, 2, 2), true, true, true, false, PublicationType.CLASIFFIED, OperationType.ALQUILER,CategoryListing.PARTICULAR, new PriceImpl(450000.0, 30000.0, 10.0), new PublisherImpl());
//        Posting p4 = new PostingImpl(4L,"La casa de Moni", "Resiste un aluvión", "Rivadavia 4585, Santa Fe", "www.foto.jpg", true, new FeatureImpl(235.0, 2, 4, 2, 2), true, true, true, false, PublicationType.CLASIFFIED, OperationType.ALQUILER,CategoryListing.PARTICULAR, new PriceImpl(450000.0, 30000.0, 10.0), new PublisherImpl());
//        Posting p5 = new PostingImpl(5L,"Obra en progreso", "Si venis y ayudas, super descuento!!", "Vedia 4543", "www.foto.jpg", true, new FeatureImpl(235.0, 2, 4, 2, 2), true, true, true, false, PublicationType.CLASIFFIED, OperationType.ALQUILER,CategoryListing.PARTICULAR, new PriceImpl(450000.0, 30000.0, 10.0), new PublisherImpl());

        //Util.savePosting(p5);
        //Util.postingAutocomplete();
        List<Posting> postings = Util.getPostings();
        //Util.sortPostingsByPublicationType(postingsDevueltos);
        //Util.sortPostingsById(postings);
        //Util.sortPostingsByBathroom(postings);
        postings.forEach(x -> System.out.println(x.toString()));

        Filter filter = new FilterImpl(OperationType.ALQUILER,true, true, true, false, PublicationType.CLASIFFIED, 1, 3, 1, 2);
        MatchPosting mp = new MatchPosting();

        //List<Posting> filterList = mp.findPostings(filter);
        //filterList.forEach(x -> System.out.println(x.toString()));
    }

}