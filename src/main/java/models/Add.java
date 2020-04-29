package models;
import java.util.ArrayList;


public class Add {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Add> heros = new ArrayList<>();


    public Add(String name,int age,String power,String weakness){
        this.name = name;
        this.age = age;
        this.power= power;
        this.weakness = weakness;
        id =heros.size();
        heros.add(this);

    }
    public String getName(){
        return  name;//we can create new hero
    }
    public int getAge(){
        return age;
    }
    public String getPower(){
        return power;
    }
    public String getWeakness(){
        return weakness;
    }
    public  static ArrayList<Add>getAll(){
        return heros;
    }
    public static void clear(){
        heros.clear();
    }
    public int getId(){
        return id;
    }
    public static Add find(int id){
        return heros.get(id-1);
    }

}
