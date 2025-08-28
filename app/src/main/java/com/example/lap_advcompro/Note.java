package com.example.lap_advcompro;
//คลาสแม่ของTexNote และ checkListNote (supperclass)
public  abstract class Note {
   //Attribute
    private String createdDate;

    private int noteID;
    private String content;
    private String title;
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
    public abstract void displayNote();


}
