package org.example;

import java.util.Objects;

public class FilterImpl extends Filter{
    private OperationType operationType;
    private Boolean favorite;
    private Boolean contacted;
    private Boolean viewed;
    private Boolean hasWhatsapp;
    private PublicationType publicationType;
    private Integer roomsFrom;
    private Integer roomsTo;
    private Integer bathroomsFrom;
    private Integer bathroomsTo;

    public FilterImpl(){
    }

    public FilterImpl(OperationType operationType, Boolean favorite, Boolean contacted, Boolean viewed, Boolean hasWhatsapp,
                      PublicationType publicationType, Integer roomsFrom, Integer roomsTo, Integer bathroomsFrom, Integer bathroomsTo)
    {
        this.operationType = operationType;
        this.favorite = favorite;
        this.contacted = contacted;
        this.viewed = viewed;
        this.hasWhatsapp = hasWhatsapp;
        this.publicationType = publicationType;
        this.roomsFrom = roomsFrom;
        this.roomsTo = roomsTo;
        this.bathroomsFrom = bathroomsFrom;
        this.bathroomsTo = bathroomsTo;
    }

    @Override
    public OperationType getOperationType() {
        return operationType;
    }

    @Override
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
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
    public Integer getRoomsFrom() {
        return roomsFrom;
    }

    @Override
    public void setRoomsFrom(Integer roomsFrom) {
        this.roomsFrom = roomsFrom;
    }

    @Override
    public Integer getRoomsTo() {
        return roomsTo;
    }

    @Override
    public void setRoomsTo(Integer roomsTo) {
        this.roomsTo = roomsTo;
    }

    @Override
    public Integer getBathroomsFrom() {
        return bathroomsFrom;
    }

    @Override
    public void setBathroomsFrom(Integer bathroomsFrom) {
        this.bathroomsFrom = bathroomsFrom;
    }

    public Integer getBathroomsTo() {
        return bathroomsTo;
    }

    @Override
    public void setBathroomsTo(Integer bathroomsTo) {
        this.bathroomsTo = bathroomsTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterImpl filter = (FilterImpl) o;
        return operationType == filter.operationType && Objects.equals(favorite, filter.favorite) && Objects.equals(contacted, filter.contacted) && Objects.equals(viewed, filter.viewed) && Objects.equals(hasWhatsapp, filter.hasWhatsapp) && publicationType == filter.publicationType && Objects.equals(roomsFrom, filter.roomsFrom) && Objects.equals(roomsTo, filter.roomsTo) && Objects.equals(bathroomsFrom, filter.bathroomsFrom) && Objects.equals(bathroomsTo, filter.bathroomsTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationType, favorite, contacted, viewed, hasWhatsapp, publicationType, roomsFrom, roomsTo, bathroomsFrom, bathroomsTo);
    }

    @Override
    public String toString() {
        return "FilterImpl{" +
                "operationType=" + operationType +
                ", favorite=" + favorite +
                ", contacted=" + contacted +
                ", viewed=" + viewed +
                ", hasWhatsapp=" + hasWhatsapp +
                ", publicationType=" + publicationType +
                ", roomsFrom=" + roomsFrom +
                ", roomsTo=" + roomsTo +
                ", bathroomsFrom=" + bathroomsFrom +
                ", bathroomsTo=" + bathroomsTo +
                '}';
    }

}
