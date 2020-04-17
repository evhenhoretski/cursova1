package edu.evhen.cursova.forms;

public class HeadofficeForm {
    private String id;
    private String adress;//адрес

    public HeadofficeForm(String id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Headoffice{" +
                "id='" + id + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
