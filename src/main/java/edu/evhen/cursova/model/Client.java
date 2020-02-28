package edu.evhen.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Client {
    @Id
    private String id;
    private String professional;//професіонал знижка в тій філії
    private String amateurs;//аматор
    private String discountcard;//наявність дисконтної карти

    public Client(String id, String professional, String amateurs, String discountcard) {
        this.id = id;
        this.professional = professional;
        this.amateurs = amateurs;
        this.discountcard = discountcard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getAmateurs() {
        return amateurs;
    }

    public void setAmateurs(String amateurs) {
        this.amateurs = amateurs;
    }

    public String getDiscountcard() {
        return discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", professional='" + professional + '\'' +
                ", amateurs='" + amateurs + '\'' +
                ", discountcard=" + discountcard +
                '}';
    }
}
