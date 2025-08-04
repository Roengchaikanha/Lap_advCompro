package com.example.lap_advcompro;

public class Note {
    //Attribute
    protected String title;
    protected String createdDate;
    //getter Method
    public String getTextContent(){
        return title;
    }
    //setter Method
    public void setTextContent(String newContent){
        this.title = title;
    }
    //Method
    public void getSummary() {
    }
}
