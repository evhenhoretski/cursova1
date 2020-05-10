package edu.evhen.cursova.forms;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PhotocenterForm {
    private String id;
    //    private String provider;
    @NotNull
    @Size(min=2, max=30)
    private int proceeds;//виторг

    @NotNull
    @Min(18)
    private String order;//замовлення
    private String workplace;//робочі місця

    public PhotocenterForm(String id, int proceeds, String order, String workplace) {
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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
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
