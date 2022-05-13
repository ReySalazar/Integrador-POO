package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as=FilterImpl.class)
public abstract class Filter {

    public abstract OperationType getOperationType();

    public abstract void setOperationType(OperationType operationType);

    public abstract Boolean getFavorite();

    public abstract void setFavorite(Boolean favorite);

    public abstract Boolean getContacted();

    public abstract void setContacted(Boolean contacted);

    public abstract Boolean getViewed();

    public abstract void setViewed(Boolean viewed);

    public abstract Boolean getHasWhatsapp();

    public abstract void setHasWhatsapp(Boolean hasWhatsapp);

    public abstract PublicationType getPublicationType();

    public abstract void setPublicationType(PublicationType publicationType);

    public abstract Integer getRoomsFrom();

    public abstract void setRoomsFrom(Integer rooms);

    public abstract  Integer getRoomsTo();

    public abstract void setRoomsTo(Integer rooms);

    public abstract Integer getBathroomsFrom();

    public abstract void setBathroomsFrom(Integer bathrooms);

    public abstract Integer getBathroomsTo();

    public abstract void setBathroomsTo(Integer bathrooms);

}
