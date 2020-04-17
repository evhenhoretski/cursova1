package edu.evhen.cursova.forms;

import java.time.LocalDateTime;

public class PrintForm {
    private String id;
    private int number;//кількість фото
    private String format;//формат
    private String type;//тип паперу
    private LocalDateTime term;//термін

    public PrintForm(String id, int number, String format, String type, LocalDateTime term) {
        this.id = id;
        this.number = number;
        this.format = format;
        this.type = type;
        this.term = term;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getTerm() {
        return term;
    }

    public void setTerm(LocalDateTime term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Print{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", format='" + format + '\'' +
                ", type='" + type + '\'' +
                ", term=" + term +
                '}';
    }
}
