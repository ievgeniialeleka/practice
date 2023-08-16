package com.itvdn.simpleserialization;

import java.io.Serializable;
import java.util.Objects;

public class Species implements Serializable {

    private String name;
    private String habitat;

    public Species(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Species {" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Species species = (Species) o;
        return Objects.equals(name, species.name) && Objects.equals(habitat, species.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, habitat);
    }
}
