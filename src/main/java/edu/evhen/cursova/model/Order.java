package edu.evhen.cursova.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
    @Id
    private String id;
    private String paper;//папір
    private String film;//фотоплівка
    private String chemical;//хімічні реактиви
    private String dissemination;//розповсюдження

    public Order(String id, String paper, String film, String chemical, String dissemination) {
        this.id = id;
        this.paper = paper;
        this.film = film;
        this.chemical = chemical;
        this.dissemination = dissemination;
    }

    public Order() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getChemical() {
        return chemical;
    }

    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    public String getDissemination() {
        return dissemination;
    }

    public void setDissemination(String dissemination) {
        this.dissemination = dissemination;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", paper='" + paper + '\'' +
                ", film='" + film + '\'' +
                ", chemical='" + chemical + '\'' +
                ", dissemination='" + dissemination + '\'' +
                '}';
    }
}
