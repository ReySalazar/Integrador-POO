package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as=PublisherImpl.class)
public abstract class Publisher {
    public abstract String getLogoUrl();

    public abstract void setLogoUrl(String logoUrl);

    public abstract Boolean getIsPremier();

    public abstract void setIsPremier (Boolean isPremier);

}
