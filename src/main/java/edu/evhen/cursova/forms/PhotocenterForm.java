package edu.evhen.cursova.forms;

public class PhotocenterForm {
    private String id;
    //    private String provider;
    private int proceeds;//виторг
    private String order;//замовлення
    private int workplace;//робочі місця

    public PhotocenterForm(String id, int proceeds, String order, int workplace) {
        this.id = id;
        this.proceeds = proceeds;
        this.order = order;
        this.workplace = workplace;
    }

    public PhotocenterForm() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getProceeds() {
        return proceeds;
    }

    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getWorkplace() {
        return workplace;
    }

    public void setWorkplace(int workplace) {
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
