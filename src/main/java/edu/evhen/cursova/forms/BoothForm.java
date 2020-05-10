package edu.evhen.cursova.forms;

public class BoothForm {
    private String id;
    private String adress;//адрес
    private String workplace;//кількість робочих місць
    private String manifestation;//проявка
    private String printing;//друк
    private String discountcard;//дистконтна картка
    private String selling;//продаж товару
    private int proceeds;//виторг
    private String goods;//отримання товар

    public BoothForm(String id, String adress, String workplace, String manifestation,
                 String printing, String discountcard, String selling, int proceeds, String goods) {
        this.id = id;
        this.adress = adress;
        this.workplace = workplace;
        this.manifestation = manifestation;
        this.printing = printing;
        this.discountcard = discountcard;
        this.selling = selling;
        this.proceeds = proceeds;
        this.goods = goods;
    }

    public BoothForm() {

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

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getManifestation() {
        return manifestation;
    }

    public void setManifestation(String manifestation) {
        this.manifestation = manifestation;
    }

    public String getPrinting() {
        return printing;
    }

    public void setPrinting(String printing) {
        this.printing = printing;
    }

    public String getDiscountcard() {
        return discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard;
    }

    public String getSelling() {
        return selling;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public int getProceeds() {
        return proceeds;
    }

    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Booth{" +
                "id='" + id + '\'' +
                ", adress='" + adress + '\'' +
                ", workplace=" + workplace +
                ", manifestation='" + manifestation + '\'' +
                ", printing='" + printing + '\'' +
                ", discountcard='" + discountcard + '\'' +
                ", selling='" + selling + '\'' +
                ", proceeds=" + proceeds +
                ", goods='" + goods + '\'' +
                '}';
    }
}
