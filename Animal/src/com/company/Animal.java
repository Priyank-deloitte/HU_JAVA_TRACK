package com.company;

public class Animal {
    private String name;
    private float weight;
    private int number_of_legs;

    public String getName(){
        return name;
    }
    public float getWeight(){
        return weight;

    }
    public int getNumberOfLegs(){
        return number_of_legs;

    }
    public void setName(String name ){
        this.name= name;
    }
    public void setWeight(float weight){
        this.weight= weight;
    }

    public void setNumberOfLegs(int number_of_legs){
        this.number_of_legs= number_of_legs;

    }

    public static void main(String[] args){

        Animal dog = new Animal();
        dog.setName("Bull Dog");
        dog.setWeight(35.6f);
        dog.setNumberOfLegs(4);

        System.out.println("Name of the dog: "+ dog.getName());
        System.out.println("Weight of the dog : "+ dog.getWeight());
        System.out.println("Number of legs : "+ dog.getNumberOfLegs());
    }
}
