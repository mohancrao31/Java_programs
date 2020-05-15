package com.udemycourse;

public class Person {
   private String firstName;
   private String lastName;
   private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 100 && age > 0) {
            this.age = age;
        } else{
            this.age = 0;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return (getAge() >= 13 && getAge() < 20);

    }

    public String getFullName(){
        if (getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        } else if (getFirstName().isEmpty()){
            return getLastName();
        } else if (getLastName().isEmpty()){
            return getFirstName();
        } else {
            return getFirstName()+ " " + getLastName();
        }
    }
}
