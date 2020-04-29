package models;
import java.util.ArrayList;


public class Add {
    private  String name;
    private  int age;
    private  String power;
    private  String weakness;
    private  int id;

    private static  ArrayList<Add> instances = new ArrayList<>();


    public Add(String name,int age,String power,String weakness){
        this.name = name;
        this.age = age;
        this.power= power;
        this.weakness = weakness;
        this.id =instances.size();
        instances.add(this);

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
        return instances;
    }
    public static void clear(){
        instances.clear();
    }
    public int getId(){
        return id;
    }
    public static Add find(int id){
        return instances.get(id-1);
    }

}
