package com.example.lap_advcompro;

import java.util.List;

class ChecklistNote extends Note {
    private List<String> items;


    public void getSummary() {
        String strItems = "";
        int noOfList = items.size();
        for(int i=0 ; i< noOfList ; i++){
            strItems = strItems+items.get(i);
        }
        //return title+":"+strItems+"("+createdDate+")";
    }
}