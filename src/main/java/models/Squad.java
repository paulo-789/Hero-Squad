package models;

import java.util.ArrayList;

public class Squad {
    private int size;
    private String squad;
    private String mission;

    private static ArrayList<Squad> squads =new ArrayList<>();

    public Squad (int size,String squad,String mission){
     this.size = size;
     this.squad= squad;
     this.mission=mission;
     squads.add(this);
     }
     public int getSize(){
        return size;
     }
     public String getSquad(){
        return squad;
     }
     public String getMission(){
        return mission;
     }

}