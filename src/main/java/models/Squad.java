package models;

import java.util.ArrayList;

public class Squad {
    private int size;
    private String squad;
    private String mission;
    private  int id;

    private static ArrayList<Squad> squads =new ArrayList<>();

    public Squad (int size,String squad,String mission){
     this.size = size;
     this.squad= squad;
     this.mission=mission;
     this.id =squads.size();
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
     public static ArrayList<Squad>getAll(){
        return squads;
     }
    public static void clear() {
        squads.clear();
    }
    public int findid(){
        return id;
    }

}

