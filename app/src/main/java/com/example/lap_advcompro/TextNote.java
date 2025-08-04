package com.example.lap_advcompro;

public class TextNote extends Note{
    //Attribute
    public String setTextContent;
    private String textContent;

    //getter Method
    public String getTextContent(){
        return textContent;
    }

    //setter Method
    public void setTextContent(String newContent){
        this.textContent = newContent;
    }

    //Method
    public void getSummary() {
        //System.out.prinln(title + ": " + textContent + " (" + createdDate + ")");
    }
}