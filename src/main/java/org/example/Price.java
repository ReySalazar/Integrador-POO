package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as=PriceImpl.class)
public abstract class Price {
    public abstract Double getValue();          // 70.000.

    public abstract void setValue (Double value);

    public abstract Double getExpenses();

    public abstract void setExpenses (Double expenses);

    public abstract Double getPriceLowerPercentage();

    public abstract void setPriceLowerPercentage (Double priceLowerPercentage);

}


