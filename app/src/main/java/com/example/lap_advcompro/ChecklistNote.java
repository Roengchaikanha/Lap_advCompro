package com.example.lap_advcompro;

import java.util.ArrayList;
import java.util.List;

class ChecklistNote extends Note {
    //attribute
    private String task1;
    private String task2;
    private String task3;
    //setter
    public void setTask1(String task1) {
        this.task1 = task1;
    }
    public void setTask2(String task2) {
        this.task2 = task2;
    }
    public void setTask3(String task3) {
        this.task3 = task3;
    }
    //getter
    public String getTask1() {
        return task1;
    }
    public String getTask2() {
        return task2;
    }
    public String getTask3() {
        return task3;
    }
//override abstract method from superclass note
    public void displayNote() {
        System.out.println("Title: " + getTitle());
        System.out.println("Content: " + getContent());
        System.out.println("Created Date: " + getcreatedDate());

      if (task1 != null) {
          System.out.println("Task 1: " + task1);
      }
      if (task2 != null) {
          System.out.println("Task 2: " + task2);
      }
      if (task3 != null) {
          System.out.println("Task 3: " + task3);
      }

    }











}