package edu.evhen.cursova.forms;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class PersonForm {
    private String id;

    @NotNull
    @Max(30)
    private String name;

    @NotNull
    private String card;

    @NotNull
    private String professional;

    public PersonForm(String id, String name, String card, String professional) {
        this.id = id;
        this.name = name;
        this.card = card;
        this.professional = professional;
    }

    public PersonForm() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "PersonForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", card='" + card + '\'' +
                ", professional='" + professional + '\'' +
                '}';
    }
}
