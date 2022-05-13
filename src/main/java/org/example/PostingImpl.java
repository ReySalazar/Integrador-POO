package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PostingImpl extends Posting implements Comparable<PostingImpl>{
    private Long id;
    private String title;
    private String description;
    private String address;
    private String picturesUrl;
    private boolean development;
    private Feature features;
    private List<String> tags;
    private Boolean favorite;
    private Boolean contacted;
    private Boolean viewed;
    private Boolean hasWhatsapp;
    private PublicationType publicationType;
    private OperationType operationType;
    private CategoryListing categoryListing;
    private Price price;
    private Publisher publisher;
    // ejemplos "RESERVED, 300, "VIDEO", "ADMITS PETS", "CREDIT, //SURETY INSURANCE "FINANCE
    //Constructor de prueba

    public PostingImpl(){

    }
    public PostingImpl(Long id, String title, String address, Feature features, Price price) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.features = features;
        this.price = price;
    }

   public PostingImpl(Long id, String title, String description, String address, String picturesUrl, Boolean development,
                       Feature features, Boolean favorite, Boolean contacted, Boolean viewed, Boolean hasWhatsapp,
                       PublicationType publicationType, OperationType operationType, CategoryListing categoryListing, Price price, Publisher publisher)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.address = address;
        this.picturesUrl = picturesUrl;
        this.development = development;
        this.features = features;
        tags = Arrays.asList("RESERVED", "VIDEO", "ADMITS PETS", "CREDIT", "SURETY INSURANCE", "FINANCE");
        setTags(tags);
        this.favorite = favorite;
        this.contacted = contacted;
        this.viewed = viewed;
        this.hasWhatsapp = hasWhatsapp;
        this.publicationType = publicationType;
        this.operationType = operationType;
        this.categoryListing = categoryListing;
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPicturesUrl() {
        return picturesUrl;
    }

    @Override
    public void setPicturesUrl(String picturesUrl) {
        this.picturesUrl = picturesUrl;
    }

    @Override
    public boolean getIsDevelopment() {
        return development;
    }

    @Override
    public void setIsDevelopment(Boolean development) {
        this.development = development;
    }

    @Override
    public Feature getFeatures() {
        return features;
    }

    @Override
    public void setFeatures(Feature features) {
        this.features = features;
    }

    @Override
    public List<String> getTags() {
        return tags;
    }

    @Override
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public Boolean getFavorite() {
        return favorite;
    }

    @Override
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public Boolean getContacted() {
        return contacted;
    }

    @Override
    public void setContacted(Boolean contacted) {
        this.contacted = contacted;
    }

    @Override
    public Boolean getViewed() {
        return viewed;
    }

    @Override
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public Boolean getHasWhatsapp() {
        return hasWhatsapp;
    }

    @Override
    public void setHasWhatsapp(Boolean hasWhatsapp) {
        this.hasWhatsapp = hasWhatsapp;
    }

    @Override
    public PublicationType getPublicationType() {
        return publicationType;
    }

    @Override
    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

    @Override
    public OperationType getOperationType() {
        return operationType;
    }

    @Override
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public CategoryListing getCategoryListing() {
        return categoryListing;
    }

    @Override
    public void setCategoryListing(CategoryListing categoryListing) {
        this.categoryListing = categoryListing;
    }

    @Override
    public Price getPrice() {
        return price;
    }

    @Override
    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PostingImpl posting = (PostingImpl) o;
//        return development == posting.development && Objects.equals(id, posting.id) && Objects.equals(title, posting.title) && Objects.equals(description, posting.description) && Objects.equals(address, posting.address) && Objects.equals(picturesUrl, posting.picturesUrl) && Objects.equals(features, posting.features) && Objects.equals(tags, posting.tags) && Objects.equals(favorite, posting.favorite) && Objects.equals(contacted, posting.contacted) && Objects.equals(viewed, posting.viewed) && Objects.equals(hasWhatsapp, posting.hasWhatsapp) && publicationType == posting.publicationType && operationType == posting.operationType && categoryListing == posting.categoryListing && Objects.equals(price, posting.price) && Objects.equals(publisher, posting.publisher);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostingImpl posting = (PostingImpl) o;
        return Objects.equals(favorite, posting.favorite) && Objects.equals(contacted, posting.contacted) && Objects.equals(viewed, posting.viewed) && Objects.equals(hasWhatsapp, posting.hasWhatsapp) && publicationType == posting.publicationType && operationType == posting.operationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, address, picturesUrl, development, features, tags, favorite, contacted, viewed, hasWhatsapp, publicationType, operationType, categoryListing, price, publisher);
    }

   @Override
    public String toString() {
        return "\n{" +
                "\n id=" + id +
                "\n title='" + title + '\'' +
                "\n description='" + description + '\'' +
                "\n address='" + address + '\'' +
                "\n picturesUrl='" + picturesUrl + '\'' +
                "\n development=" + development +
                "\n features=" + features +
                "\n tags=" + tags +
                "\n favorite=" + favorite +
                "\n contacted=" + contacted +
                "\n viewed=" + viewed +
                "\n hasWhatsapp=" + hasWhatsapp +
                "\n publicationType=" + publicationType +
                "\n operationType=" + operationType +
                "\n categoryListing=" + categoryListing +
                "\n price=" + price +
                "\n publisher=" + publisher +
                "\n}\n";
    }

    @Override
    public int compareTo(PostingImpl o) {
        return (int)(this.getId() - o.getId());
    }
}
