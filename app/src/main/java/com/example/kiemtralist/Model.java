package com.example.kiemtralist;

import android.os.ParcelUuid;

public class Model {
    int image,id;
    String name;

    public Model(){}

    public Model(int image, String name) {
        this.image = image;
        this.name = name;
        this.id=id;
    }

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
}
