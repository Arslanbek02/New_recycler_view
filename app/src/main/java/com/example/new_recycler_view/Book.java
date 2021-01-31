package com.example.new_recycler_view;

public class Book {
    int photo;
    String title;
    String desc;
    int price;
    int like;
    String website;

    public Book(int photo, String title, String desc, int price, int like, String website){
        this.photo = photo;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.like = like;
        this.website = website;
    }

    public int getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() { return desc; }

    public int getPrice() {
        return price;
    }

    public int getLike() {
        return like;
    }

    public String getWebsite() { return website; }
}



