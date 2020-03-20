package edu.evhen.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Photocenter {
    @Id
    private String id;
//    private String provider;
    private String proceeds;//виторг
    private String order;//замовлення
    private String workplace;//робочі місця

    public Photocenter(String id, String proceeds, String order, String workplace) {
        this.id = id;
        this.proceeds = proceeds;
        this.order = order;
        this.workplace = workplace;
    }

    public Photocenter() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProceeds() {
        return proceeds;
    }

    public void setProceeds(String proceeds) {
        this.proceeds = proceeds;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
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
