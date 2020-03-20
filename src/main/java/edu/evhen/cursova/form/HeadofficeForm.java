package edu.evhen.cursova.form;

public class HeadofficeForm {
    private String adress;//адрес

    public HeadofficeForm(String adress) {
        this.adress = adress;
    }

    public HeadofficeForm() {
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "HeadofficeForm{" +
                "adress='" + adress + '\'' +
                '}';
    }
}
