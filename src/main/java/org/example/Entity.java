package org.example;

public abstract class Entity implements Cloneable{
    public abstract int hashCode();

    public abstract boolean equals (Object obj);

    public abstract String toString();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
