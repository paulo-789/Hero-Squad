package models;

import java.util.ArrayList;

public class Add {
    private String content;
    private static ArrayList<Add> instances = new ArrayList<>();
    private int age;

    public Add(String content){
        this.content=content;
        instances.add(this);
        this.age=age;
    }
    public String getContent(){
        return  content;//we can create new hero
    }
    public static ArrayList<Add> getAll(){
        return instances;
    }
    public int getAge(){
        return age;
    }

    public static void clearAllAdds(){
        instances.clear();
    }
}
