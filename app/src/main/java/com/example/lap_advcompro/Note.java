package com.example.lap_advcompro;
//คลาสแม่ของTexNote และ checkListNote (supperclass)
public  abstract class Note {
   //Attribute
    private String createdDate;
    private User owner;
    private int noteID;
    private String content;
    private String title;
//    public Note(String createdDate, User owner, int noteID, String content, String title){
//        this.createdDate = createdDate;
//        this.owner = owner;
//        this.noteID = noteID;
//        this.content = content;
//        this.title = title;
//    }


    //setter
    public void setcreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }



    //getter
    public String getcreatedDate() {
        return createdDate;
    }
    public int getNoteID() {
        return noteID;
    }
    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }
    public User getOwner() {
        return owner;
    }
    public abstract void displayNote();


}
