package com.example.quizapp;

public class Chude {

    private  int image;

    private String name;

    private int id;

    private String gioiThieu;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public Chude(int image, String name, int id, String gioiThieu) {
        this.image = image;
        this.name = name;
        this.id = id;
        this.gioiThieu = gioiThieu;
    }
}
