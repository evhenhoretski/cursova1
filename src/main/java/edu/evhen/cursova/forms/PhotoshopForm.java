package edu.evhen.cursova.forms;

import javax.validation.constraints.NotNull;

public class PhotoshopForm {
    private String id;
    private String selling;//продаж товару
    private String ondocuments;//фото на документ
    private String restoration;//реставрація
    private int rolling;//прокат
    private String artistic;//художнє фото
    private String professionalphoto;//професіональний фотограф
    private String goods;//отримання товар

    @NotNull
    private String adress;//

    public PhotoshopForm(String id, String selling, String ondocuments, String restoration,
                     int rolling, String artistic, String professionalphoto, String goods, String adress) {
        this.id = id;
        this.selling = selling;
        this.ondocuments = ondocuments;
        this.restoration = restoration;
        this.rolling = rolling;
        this.artistic = artistic;
        this.professionalphoto = professionalphoto;
        this.goods = goods;
        this.adress = adress;
    }

    public PhotoshopForm() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelling() {
        return selling;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public String getOndocuments() {
        return ondocuments;
    }

    public void setOndocuments(String ondocuments) {
        this.ondocuments = ondocuments;
    }

    public String getRestoration() {
        return restoration;
    }

    public void setRestoration(String restoration) {
        this.restoration = restoration;
    }

    public int getRolling() {
        return rolling;
    }

    public void setRolling(int rolling) {
        this.rolling = rolling;
    }

    public String getArtistic() {
        return artistic;
    }

    public void setArtistic(String artistic) {
        this.artistic = artistic;
    }

    public String getProfessionalphoto() {
        return professionalphoto;
    }

    public void setProfessionalphoto(String professionalphoto) {
        this.professionalphoto = professionalphoto;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Photoshop{" +
                "id='" + id + '\'' +
                ", selling='" + selling + '\'' +
                ", ondocuments='" + ondocuments + '\'' +
                ", restoration='" + restoration + '\'' +
                ", rolling=" + rolling +
                ", artistic='" + artistic + '\'' +
                ", professionalphoto='" + professionalphoto + '\'' +
                ", goods='" + goods + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
