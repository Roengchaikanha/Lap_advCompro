package com.example.lap_advcompro;

public class Note {
   //Attribute
    private int noteID;
    private String content;
    private String title;
    private User user;// โน้ตนี้เป็นของใคร

   //method
    public static void setTitle(int i) {
    }

    public static void setContent(String content) {
     }

     public static void setUser(User user) {
     }


 //Setter
    public void setNoteID(int noteID) {this.noteID = noteID;}
    public void setcontent(String content) {this.content = content;}
    public void settitle(String title) {this.title = title;}

    //getter
    public int getNoteID() {return noteID;}
    public String getcontent() {return content;}
    public String gettitle() {return title;}

 public int getContent() {
     return 0;
 }
}
