package org.example;

import java.util.Objects;

public class PublisherImpl extends Publisher{
    private String logoUrl;
    private Boolean isPremier;

    public PublisherImpl(){

    }

    public PublisherImpl(String logoUrl, Boolean isPremier) {
        this.logoUrl = logoUrl;
        this.isPremier = isPremier;
    }

    @Override
    public String getLogoUrl() {
        return logoUrl;
    }

    @Override
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public Boolean getIsPremier() {
        return isPremier;
    }

    @Override
    public void setIsPremier(Boolean isPremier) {
        this.isPremier = isPremier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherImpl publisher = (PublisherImpl) o;
        return Objects.equals(logoUrl, publisher.logoUrl) && Objects.equals(isPremier, publisher.isPremier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logoUrl, isPremier);
    }

    @Override
    public String toString() {
        return " logoUrl='" + logoUrl + '\'' +
                ", isPremier=" + isPremier;
    }

}
