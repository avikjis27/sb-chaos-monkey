package com.sb.bo;

public class MonkeyBO {
    private String name;
    private String id;
    private String price;
    private String species;
    
    public MonkeyBO(String name, String id, String price, String species) {
        super();
        this.name = name;
        this.id = id;
        this.price = price;
        this.species = species;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    
    

}
