/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author david
 */
public class Taxonomy {
    
    private int code;
    private String animal;
    private String domain;
    private String kingdom;
    private String phylum;
    private String classA;
    private String orderA;
    private String family;
    private String genus;
    private String species;
    private String subspecies;

    public Taxonomy() {
    }    
    
    public Taxonomy(int code, String animal, String domain, String kingdom, String phylum, String classA, String orderA, String family, String genus, String species, String subspecies) {
        this.code = code;
        this.animal = animal;
        this.domain = domain;
        this.kingdom = kingdom;
        this.phylum = phylum;
        this.classA = classA;
        this.orderA = orderA;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.subspecies = subspecies;
    }

    public int getCode() {
        return code;
    }    
    
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getClassA() {
        return classA;
    }

    public void setClassA(String classA) {
        this.classA = classA;
    }

    public String getOrderA() {
        return orderA;
    }

    public void setOrderA(String order) {
        this.orderA = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }
    
    
}
