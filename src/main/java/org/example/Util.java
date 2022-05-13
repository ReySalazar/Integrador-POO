package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.util.Collections.sort;

public class Util {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void savePosting(List<Posting> posting) throws IOException {
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./postings.json"), posting);
    }

    public static void savePosting(Posting posting) throws IOException {
        //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("./postings.json"), posting);
        List<Posting> postings = Util.getPostings();
        postings.add(posting);
        Util.savePosting(postings);
    }

    public static Posting getPosting() throws IOException{
        return mapper.readValue(new File("./postings.json"),PostingImpl.class);
    }

    public static List<Posting> getPostings() throws IOException{
        return mapper.readValue(new File("./postings.json"), new TypeReference<List<Posting>>(){});
    }

    public static List<Posting> sortPostingsById(List<Posting> postings){
        sort(postings,
                new Comparator<Posting>() {
                    public int compare(Posting s1, Posting s2) {
                        return (int)(s1.getId() - s2.getId());
                    }
                }
        );
        return postings;
    }

    public static List<Posting> sortPostingsByBathroom(List<Posting> postings){
        sort(postings,
                new Comparator<Posting>() {
                    public int compare(Posting s1, Posting s2) {
                        return s1.getFeatures().getBathrooms() - s2.getFeatures().getBathrooms();
                    }
                }
        );
        return postings;
    }

    public static List<Posting> sortPostingsByPublicationType(List<Posting> postings){
        Collections.sort(postings,
                new Comparator<Posting>() {
                    public int compare(Posting s1, Posting s2) {
                        return (s1.getPublicationType().toString().compareTo(s2.getPublicationType().toString()));
                    }
                }
        );
        return postings;
    }

    public static void postingAutocomplete() throws IOException{
        List<Posting> postings = new ArrayList<>();
        int nroIteraciones = 95;

        for(int i=0; i<nroIteraciones; i++){
            Random rnd = new Random();
            int num = (int) (rnd.nextDouble() * 6 + 1);
            int num2 = (int) (rnd.nextDouble() * 99 + 1);
            Posting p = new PostingImpl();

            p.setId(i * num2 + 10L);
            switch (num){
                case 1 : p.setTitle("Ofertón");
                        break;
                case 2 : p.setTitle("La casa HOT!!!");
                        break;
                case 3 : p.setTitle("Departamento en Venta");
                        break;
                case 4 : p.setTitle("Casa en Venta");
                        break;
                case 5 : p.setTitle("Depertamento en Alquiler");
                        break;
                case 6 : p.setTitle("Casa en Alquiler");
            }

            switch (num){
                case 1 : p.setDescription("A estrenar");
                    break;
                case 2 : p.setDescription("Espacio amplio");
                    break;
                case 3 : p.setDescription("Lo que siempre soñaste");
                    break;
                case 4 : p.setDescription("Completamente amoblado");
                    break;
                case 5 : p.setDescription("Linda zona");
                    break;
                case 6 : p.setDescription("En quinto piso");
            }

            switch (num){
                case 1 : p.setAddress("Vedia 4545, CABA");
                    break;
                case 2 : p.setAddress("Saavedra 234, Moreno");
                    break;
                case 3 : p.setAddress("Cabildo 800, CABA");
                    break;
                case 4 : p.setAddress("Av Mitre 234, Avellaneda");
                    break;
                case 5 : p.setAddress("Av Monroe 4845, CABA");
                    break;
                case 6 : p.setAddress("Conde 810, CABA");
            }

            if(num < 4){
                p.setPicturesUrl("https://ingar.zonapropcdn.com/avisos/1/00/49/06/32/90/wh/1793779955.jpg");
            }else {
                p.setPicturesUrl("https://ingar,zonapropcdn.com/avis01/1/00/49/06/32/98/wxh/1793779957.jpg");
            }

            if(num < 4){
                p.setIsDevelopment(true);
            }else{
                p.setIsDevelopment(false);
            }

            switch (num){
                case 1 : p.setFeatures(new FeatureImpl(259.0, 5, 4, 3, 2));
                    break;
                case 2 : p.setFeatures(new FeatureImpl(75.0, 2, 3, 1, 1));
                    break;
                case 3 : p.setFeatures(new FeatureImpl(55.0, 1, 2, 1, 0));
                    break;
                case 4 : p.setFeatures(new FeatureImpl(120.0, 3, 4, 2, 1));
                    break;
                case 5 : p.setFeatures(new FeatureImpl(40.0, 1, 1, 1, 0));
                    break;
                case 6 : p.setFeatures(new FeatureImpl(180.0, 4, 4, 3, 2));
            }

            if(num < 4){
                p.setTags(Arrays.asList("RESERVED", "VIDEO", "ADMITS PETS", "CREDIT","FINANCE"));
            }else{
                p.setTags(null);
            }

            if(num < 4){
                p.setFavorite(true);
            }else{
                p.setFavorite(false);
            }

            if(num < 4){
                p.setContacted(true);
            }else{
                p.setContacted(false);
            }

            if(num < 4){
                p.setViewed(true);
            }else{
                p.setViewed(false);
            }

            if(num < 4){
                p.setHasWhatsapp(true);
            }else{
                p.setHasWhatsapp(false);
            }

            switch (num){
                case 1 : p.setPublicationType(PublicationType.EXCLUSIVE);
                    break;
                case 2 : p.setPublicationType(PublicationType.HIGHLIGHTED);
                    break;
                case 3 : p.setPublicationType(PublicationType.CLASIFFIED);
                    break;
                case 4 : p.setPublicationType(PublicationType.SUPERHIGHLIGHTED);
                    break;
                case 5 : p.setPublicationType(PublicationType.SUPERHIGHLIGHTED_DEVELOPMENT);
                    break;
                default: p.setPublicationType(PublicationType.CLASIFFIED);
            }

            switch (num){
                case 1 : p.setOperationType(OperationType.VENTA);
                    break;
                case 2 : p.setOperationType(OperationType.ALQUILER);
                    break;
                case 3 : p.setOperationType(OperationType.REMATE);
                    break;
                case 4 : p.setOperationType(OperationType.HIPOTECARIO);
                    break;
                case 5 : p.setOperationType(OperationType.FORECLOSURE);
                    break;
                case 6 : p.setOperationType(OperationType.EMPRENDIMIENTOS);
                    break;
                default: p.setOperationType(OperationType.EMPRENDIMIENTOS);
            }

            if (num < 3) {
                p.setCategoryListing(CategoryListing.EMPRENDIMIENTO);
            } else if (num < 5) {
                p.setCategoryListing(CategoryListing.CLASIFICADO);
            }else{
                p.setCategoryListing(CategoryListing.PARTICULAR);
            }

            switch (num){
                case 1 : p.setPrice(new PriceImpl(1800000.0, 15000.0, 10.0));
                    break;
                case 2 : p.setPrice(new PriceImpl(250000.0, 10000.0, 5.0));
                    break;
                case 3 : p.setPrice(new PriceImpl(3500000.0, 30000.0, 7.0));
                    break;
                case 4 : p.setPrice(new PriceImpl(7200000.0, 15000.0, 10.0));
                    break;
                case 5 : p.setPrice(new PriceImpl(460000.0, 28000.0, 8.0));
                    break;
                case 6 : p.setPrice(new PriceImpl(7800000.0, 35000.0, 10.0));
            }

           if(num < 4){
               p.setPublisher(new PublisherImpl("www.logo.com",true));
           }else {
               p.setPublisher(new PublisherImpl("www.otroLogo.com",false));
           }

            postings.add(p);

        }

        Util.savePosting(postings);
    }

}
