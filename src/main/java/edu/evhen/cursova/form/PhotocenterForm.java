package edu.evhen.cursova.form;

public class PhotocenterForm {
    private String proceeds;//виторг
    private String order;//замовлення
    private String workplace;//робочі місц

    public PhotocenterForm(String proceeds, String order, String workplace) {
        this.proceeds = proceeds;
        this.order = order;
        this.workplace = workplace;
    }

    public PhotocenterForm() {
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
        return "PhotocenterForm{" +
                "proceeds='" + proceeds + '\'' +
                ", order='" + order + '\'' +
                ", workplace='" + workplace + '\'' +
                '}';
    }
}
