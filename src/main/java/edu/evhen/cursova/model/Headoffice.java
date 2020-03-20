package edu.evhen.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Headoffice {
    @Id
    private String id;
    private String adress;//адрес

    public Headoffice(String id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public Headoffice() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Headoffice{" +
                "id='" + id + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
