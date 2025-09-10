package com.example.lap_advcompro;
public abstract class User {
    //Attribute
    private String name;
    private int ID;

    private String email;
    private int password;



    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(int password) {
        this.password = password;
    }



    //getter
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }
    public int getPassword() {
        return password;
    }

    //abstract method
    public abstract void displayUser();
}


