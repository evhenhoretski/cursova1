package edu.evhen.cursova.form;

public class OrderForm {
    private String paper;//папір
    private String film;//фотоплівка
    private String chemical;//хімічні реактиви
    private String dissemination;//розповсюдження

    public OrderForm(String paper, String film, String chemical, String dissemination) {
        this.paper = paper;
        this.film = film;
        this.chemical = chemical;
        this.dissemination = dissemination;
    }

    public OrderForm() {
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
        return "OrderForm{" +
                "paper='" + paper + '\'' +
                ", film='" + film + '\'' +
                ", chemical='" + chemical + '\'' +
                ", dissemination='" + dissemination + '\'' +
                '}';
    }
}
