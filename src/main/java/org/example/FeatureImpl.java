package org.example;

import java.util.Objects;

public class FeatureImpl extends Feature{

    private Double totalArea;
    private Integer rooms;
    private Integer environments;
    private Integer bathrooms;
    private Integer garages;

    public FeatureImpl(){

    }

    public FeatureImpl(Double totalArea, Integer rooms, Integer environments, Integer bathrooms, Integer garages) {
        this.totalArea = totalArea;
        this.rooms = rooms;
        this.environments = environments;
        this.bathrooms = bathrooms;
        this.garages = garages;
    }

    @Override
    public Double getTotalArea() {
        return totalArea;
    }

    @Override
    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }

    @Override
    public Integer getRooms() {
        return rooms;
    }

    @Override
    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    @Override
    public Integer getEnvironments() {
        return environments;
    }

    @Override
    public void setEnvironments(Integer environments) {
        this.environments = environments;
    }

    @Override
    public Integer getBathrooms() {
        return bathrooms;
    }

    @Override
    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public Integer getGarages() {
        return garages;
    }

    @Override
    public void setGarages(Integer garages) {
        this.garages = garages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeatureImpl feature = (FeatureImpl) o;
        return Objects.equals(totalArea, feature.totalArea) && Objects.equals(rooms, feature.rooms) && Objects.equals(environments, feature.environments) && Objects.equals(bathrooms, feature.bathrooms) && Objects.equals(garages, feature.garages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalArea, rooms, environments, bathrooms, garages);
    }

    @Override
    public String toString() {
        return " totalArea=" + totalArea +
                ", rooms=" + rooms +
                ", environments=" + environments +
                ", bathrooms=" + bathrooms +
                ", garages=" + garages;
    }

}
