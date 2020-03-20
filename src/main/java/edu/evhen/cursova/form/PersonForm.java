package edu.evhen.cursova.form;

public class PersonForm {
    private String name;
    private String card;
    private String professional;

    public PersonForm(String name, String card, String professional) {
        this.name = name;
        this.card = card;
        this.professional = professional;
    }

    public PersonForm() {
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
                ", name='" + name + '\'' +
                ", card='" + card + '\'' +
                ", professional='" + professional + '\'' +
                '}';
    }
}
