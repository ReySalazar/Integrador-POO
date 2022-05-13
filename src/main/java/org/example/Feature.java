package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as=FeatureImpl.class)
public abstract class Feature {
    public abstract Double getTotalArea();      // ejemplo 50 m2"

    public abstract void setTotalArea (Double totalArea);

    public abstract Integer getRooms();

    public abstract void setRooms (Integer rooms);

    public abstract Integer getEnvironments();

    public abstract void setEnvironments (Integer environments);

    public abstract Integer getBathrooms();

    public abstract void setBathrooms (Integer bathrooms);

    public abstract Integer getGarages();

    public abstract void setGarages (Integer garages);


}
