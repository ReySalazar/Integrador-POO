package org.example;

import java.util.Objects;

public class PriceImpl extends Price{
    private Double value;
    private Double expenses;
    private Double priceLowerPercentage;

    public PriceImpl(){

    }

    public PriceImpl(Double value, Double expenses, Double priceLowerPercentage) {
        this.value = value;
        this.expenses = expenses;
        this.priceLowerPercentage = priceLowerPercentage;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public Double getExpenses() {
        return expenses;
    }

    @Override
    public void setExpenses(Double expenses) {
        this.expenses = expenses;
    }

    @Override
    public Double getPriceLowerPercentage() {
        return priceLowerPercentage;
    }

    @Override
    public void setPriceLowerPercentage(Double priceLowerPercentage) {
        this.priceLowerPercentage = priceLowerPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceImpl price = (PriceImpl) o;
        return Objects.equals(value, price.value) && Objects.equals(expenses, price.expenses) && Objects.equals(priceLowerPercentage, price.priceLowerPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, expenses, priceLowerPercentage);
    }

    @Override
    public String toString() {
        return " value=" + value +
                ", expenses=" + expenses +
                ", priceLowerPercentage=" + priceLowerPercentage;
    }

}
