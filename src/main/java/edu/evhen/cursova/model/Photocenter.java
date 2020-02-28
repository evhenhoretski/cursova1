package edu.evhen.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Photocenter {
    @Id
    private String id;
//    private String provider;
    private int proceeds;//виторг
    private String order;//замовлення
    private int workplace;//робочі місця

    public Photocenter(String id, int proceeds, String order, int workplace) {
        this.id = id;
        this.proceeds = proceeds;
        this.order = order;
        this.workplace = workplace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getProceeds() {
        return proceeds;
    }

    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getWorkplace() {
        return workplace;
    }

    public void setWorkplace(int workplace) {
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return "Photocenter{" +
                "id='" + id + '\'' +
                ", proceeds=" + proceeds +
                ", order='" + order + '\'' +
                ", workplace=" + workplace +
                '}';
    }
}
