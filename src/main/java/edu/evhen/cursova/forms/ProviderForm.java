package edu.evhen.cursova.forms;

public class ProviderForm {
    private String id;
    private String name;
    private String paper;
    private String film;
    private String paint;

    public ProviderForm(String id, String name, String paper, String film, String paint) {
        this.id = id;
        this.name = name;
        this.paper = paper;
        this.film = film;
        this.paint = paint;
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", paper='" + paper + '\'' +
                ", film='" + film + '\'' +
                ", paint='" + paint + '\'' +
                '}';
    }
}
