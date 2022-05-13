package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;


@JsonDeserialize(as=PostingImpl.class)
public abstract class Posting extends Entity{
    public abstract Long getId();  // id -> Long

    public abstract void setId(Long id);

    public abstract String getTitle();

    public abstract void setTitle (String title);

    public abstract String getDescription();

    public abstract void setDescription(String description);

    public abstract String getAddress();

    public abstract void setAddress(String address);

    public abstract String getPicturesUrl();

//ejemplo

//"https://ingar.zonapropcdn.com/avisos/1/00/49/06/32/90/wh/1793779955.jpg",

//"https://ingar,zonapropcdn.com/avis01/1/00/49/06/32/98/wxh/1793779957.jpg"

    public abstract void setPicturesUrl (String picturesUrl);

    public abstract boolean getIsDevelopment ();

    public abstract void setIsDevelopment (Boolean development);

    public abstract Feature getFeatures();

    public abstract void setFeatures (Feature features);

    public abstract List<String> getTags();

    public abstract void setTags(List<String> tags);

    public abstract Boolean getFavorite();

    public abstract void setFavorite(Boolean favorite);

    public abstract Boolean getContacted();

    public abstract void setContacted (Boolean contacted);

    public abstract Boolean getViewed();

    public abstract void setViewed (Boolean viewed);

    public abstract Boolean getHasWhatsapp();

    public abstract void setHasWhatsapp(Boolean hasWhatsapp);

    public abstract PublicationType getPublicationType();

    public abstract void setPublicationType(PublicationType publicationType);

    public abstract OperationType getOperationType();

    public abstract void setOperationType (OperationType operationType);

    public abstract CategoryListing getCategoryListing();

    public abstract void setCategoryListing(CategoryListing categoryListing);

    public abstract Price getPrice();

    public abstract void setPrice (Price price);

    public abstract Publisher getPublisher();

    public abstract void setPublisher (Publisher publisher);

}



