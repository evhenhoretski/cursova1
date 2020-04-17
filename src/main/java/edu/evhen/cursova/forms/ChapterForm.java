package edu.evhen.cursova.forms;

import edu.evhen.cursova.model.Photocenter;

public class ChapterForm {
    private String id;
    private String adress;//адрес
    private int workplace;//кількість робочих місць
    private String booth;//кіоски
    private Boolean implemintation;//виконання замовлення
    private String manifestation;//проявка
    private String printing;//друк
    private String urgent;//термінові
    private String discountcard;//дистконтна картка
    private int film;//продаж плівки
    private String sale;//знижки для професіоналів
    private String proceeds;//виторг
    private String goods;//отримання товар
    private Photocenter photocenter;

    public ChapterForm(String id, String adress, int workplace, String booth, Boolean implemintation,
                   String manifestation, String printing, String urgent, String discountcard, int film,
                   String sale, String proceeds, String goods, Photocenter photocenter) {
        this.id = id;
        this.adress = adress;
        this.workplace = workplace;
        this.booth = booth;
        this.implemintation = implemintation;
        this.manifestation = manifestation;
        this.printing = printing;
        this.urgent = urgent;
        this.discountcard = discountcard;
        this.film = film;
        this.sale = sale;
        this.proceeds = proceeds;
        this.goods = goods;
        this.photocenter = photocenter;
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

    public int getWorkplace() {
        return workplace;
    }

    public void setWorkplace(int workplace) {
        this.workplace = workplace;
    }

    public String getBooth() {
        return booth;
    }

    public void setBooth(String booth) {
        this.booth = booth;
    }

    public Boolean getImplemintation() {
        return implemintation;
    }

    public void setImplemintation(Boolean implemintation) {
        this.implemintation = implemintation;
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

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getDiscountcard() {
        return discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard;
    }

    public int getFilm() {
        return film;
    }

    public void setFilm(int film) {
        this.film = film;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getProceeds() {
        return proceeds;
    }

    public void setProceeds(String proceeds) {
        this.proceeds = proceeds;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Photocenter getPhotocenter() {
        return photocenter;
    }

    public void setPhotocenter(Photocenter photocenter) {
        this.photocenter = photocenter;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", adress='" + adress + '\'' +
                ", workplace=" + workplace +
                ", booth='" + booth + '\'' +
                ", implemintation=" + implemintation +
                ", manifestation='" + manifestation + '\'' +
                ", printing='" + printing + '\'' +
                ", urgent='" + urgent + '\'' +
                ", discountcard='" + discountcard + '\'' +
                ", film=" + film +
                ", sale='" + sale + '\'' +
                ", proceeds='" + proceeds + '\'' +
                ", goods='" + goods + '\'' +
                ", photocenter=" + photocenter +
                '}';
    }
}
