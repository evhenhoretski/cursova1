package edu.evhen.cursova.form;

public class ClientForm {
    private String professional;//професіонал знижка в тій філії
    private String amateurs;//аматор
    private String discountcard;//наявність дисконтної карти


    public ClientForm(String professional, String amateurs, String discountcard) {
        this.professional = professional;
        this.amateurs = amateurs;
        this.discountcard = discountcard;
    }

    public ClientForm() {
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
        return "ClientForm{" +
                "professional='" + professional + '\'' +
                ", amateurs='" + amateurs + '\'' +
                ", discountcard='" + discountcard + '\'' +
                '}';
    }
}
