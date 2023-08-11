package entity;

import java.util.Arrays;

public class Country {

    private Name name;
    private boolean independent;
    private String status;
    private boolean unMember;
    private String[] capital;
    private String region;
    private String subregion;
    private String[] languages;
    private boolean landlocked;
    private int area;
    private int population;

    public Country() {
    }

    public Country(Name name, boolean independent, String status, boolean unMember, String[] capital, String region, String subregion, String[] languages, boolean landlocked, int area, int population) {
        this.name = name;
        this.independent = independent;
        this.status = status;
        this.unMember = unMember;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.landlocked = landlocked;
        this.area = area;
        this.population = population;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public boolean isIndependent() {
        return independent;
    }

    public void setIndependent(boolean independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public String[] getCapital() {
        return capital;
    }

    public void setCapital(String[] capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + name +
                ", independent=" + independent +
                ", status='" + status + '\'' +
                ", unMember=" + unMember +
                ", capital=" + Arrays.toString(capital) +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", landlocked=" + landlocked +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
