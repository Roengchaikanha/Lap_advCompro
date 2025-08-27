package com.example.lap_advcompro;
public class User {
    //Attribute
    private String name;
    private String email;
    private int password;
    //method
    public static void setID(int i) {
    }

    //Setter
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(int password) {this.password = password;}

    //Getter
    public String getName() {return name;}
    public String getEmail() {return email;}
    public int getPassword() {return password;}

}
