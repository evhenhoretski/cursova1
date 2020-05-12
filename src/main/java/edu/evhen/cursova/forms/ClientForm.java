package edu.evhen.cursova.forms;

import javax.validation.constraints.NotNull;

public class ClientForm {
    private String id;

    @NotNull
    private String professional;//професіонал знижка в тій філії
    private String amateurs;//аматор

    @NotNull
    private String discountcard;//наявність дисконтної карти

    public ClientForm(String id, String professional, String amateurs, String discountcard) {
        this.id = id;
        this.professional = professional;
        this.amateurs = amateurs;
        this.discountcard = discountcard;
    }

    public ClientForm() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getAmateurs() {
        return amateurs;
    }

    public void setAmateurs(String amateurs) {
        this.amateurs = amateurs;
    }

    public String getDiscountcard() {
        return discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", professional='" + professional + '\'' +
                ", amateurs='" + amateurs + '\'' +
                ", discountcard=" + discountcard +
                '}';
    }
}
