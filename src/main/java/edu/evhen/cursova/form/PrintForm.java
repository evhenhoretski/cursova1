package edu.evhen.cursova.form;

import java.time.LocalDateTime;

public class PrintForm {
    private int number;//кількість фото
    private String format;//формат
    private String type;//тип паперу
    private LocalDateTime term;//термін

    public PrintForm(int number, String format, String type, LocalDateTime term) {
        this.number = number;
        this.format = format;
        this.type = type;
        this.term = term;
    }

    public PrintForm() {
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
        return "PrintForm{" +
                "number=" + number +
                ", format='" + format + '\'' +
                ", type='" + type + '\'' +
                ", term=" + term +
                '}';
    }
}
