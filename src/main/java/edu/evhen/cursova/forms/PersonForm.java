package edu.evhen.cursova.forms;

public class PersonForm {
    private String id;
    private String name;
    private String card;
    private String professional;

    public PersonForm(String id, String name, String card, String professional) {
        this.id = id;
        this.name = name;
        this.card = card;
        this.professional = professional;
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
