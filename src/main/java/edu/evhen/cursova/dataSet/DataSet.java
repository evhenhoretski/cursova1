package edu.evhen.cursova.dataSet;

import edu.evhen.cursova.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataSet {
    Photocenter mainPhotocenter = new Photocenter("4", "4", "ooo", "7");
    private List<Photocenter> photocenters = Arrays.asList(
            new Photocenter("1", "5", "paper", "6"),
            new Photocenter("2",  "3", "paper", "8"),
            new Photocenter("3",  "3", "paper", "7"),
            mainPhotocenter
    );
    private Photocenter firstPhotocenter = photocenters.get(0);
    private Photocenter secondPhotocenter = photocenters.get(1);

    public List<Photocenter> getPhotocenters() {
        return photocenters;
    }

    public void setPhotocenters(List<Photocenter> photocenters) {
        this.photocenters = photocenters;
    }


    private List<Booth> booths = new ArrayList<>(Arrays.asList(
            new Booth("1", "Hoholya", '5', "true", "13", "true",
                    "10", '0', "15"),
            new Booth("2", "Mozart", '2', "true", "67", "false",
                    "10", '0', "15")
    ));

    public List<Booth> getBooths() {
        return booths;
    }

    public void setBooths(List<Booth> booths) {
        this.booths = booths;
    }


    private List<Chapter> chapters = new ArrayList<>(Arrays.asList(
            new Chapter("1", "Hoholya", '5', "1", "true", "5",
                    "10", "0", "true", '5',
                    "10", "1400", "14", firstPhotocenter),
            new Chapter("2", "Pidhirska", '3', "1", "false", "5",
                    "10", "3", "true", '5',
                    "10", "1400", "14", secondPhotocenter)
    ));

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }


    private List<Client> clients = new ArrayList<>(Arrays.asList(
            new Client("1", "true", "false", "true"),
            new Client("2",  "false", "true", "false")
    ));

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }


    private List<Headoffice> headoffices = new ArrayList<>(Arrays.asList(
            new Headoffice("1", "Flakona"),
            new Headoffice("2",  "Petrovucha")
    ));

    public List<Headoffice> getHeadoffices() {
        return headoffices;
    }

    public void setHeadoffices(List<Headoffice> headoffices) {
        this.headoffices = headoffices;
    }


    private List<Order> orders = new ArrayList<>(Arrays.asList(
            new Order("1", "100", "50", "40", "кіоск"),
            new Order("2", "103", "50", "40", "фотоцентр")
    ));

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }


    private List<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("1", "100", "50", "40"),
            new Person("2", "103", "50", "40")
    ));

    public List<Person> getPerson() {
        return persons;
    }

    public void setPerson(List<Person> orders) {
        this.persons = persons;
    }


    private List<Photoshop> photoshops = new ArrayList<>(Arrays.asList(
            new Photoshop("1", "10", "5", "15", '3', "5",
                    "100", "0", "Hryshevskogo"),
            new Photoshop("2", "3", "90", "15", '3', "5",
                    "100", "0", "Podolyanska")
    ));

    public List<Photoshop> getPhotoshops() {
        return photoshops;
    }

    public void setPhotoshops(List<Photoshop> photoshops) {
        this.photoshops = photoshops;
    }


    private List<Print> prints = new ArrayList<>(Arrays.asList(
            new Print("1", '1', "A2", "глянц", LocalDateTime.now()),
            new Print("2", '9', "A1", "матовий", LocalDateTime.now())
    ));

    public List<Print> getPrints() {
        return prints;
    }

    public void setPrints(List<Print> prints) {
        this.prints = prints;
    }


    private List<Provider> providers = new ArrayList<>(Arrays.asList(
            new Provider("1", "Pasha", "50", "40", "300"),
            new Provider("2", "Kolya", "50", "40", "345")
    ));

    public List<Provider> getProviders() {
        return providers;
    }

    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }
}
