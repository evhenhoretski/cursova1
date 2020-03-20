package edu.evhen.cursova.form;

public class ProviderForm {
    private String name;
    private String paper;
    private String film;
    private String paint;

    public ProviderForm(String name, String paper, String film, String paint) {
        this.name = name;
        this.paper = paper;
        this.film = film;
        this.paint = paint;
    }

    public ProviderForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    @Override
    public String toString() {
        return "Provider{" +
                ", name='" + name + '\'' +
                ", paper='" + paper + '\'' +
                ", film='" + film + '\'' +
                ", paint='" + paint + '\'' +
                '}';
    }
}
