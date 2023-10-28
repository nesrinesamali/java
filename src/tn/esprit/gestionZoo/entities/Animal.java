package tn.esprit.gestionZoo.entities;

public  sealed class Animal permits Aquatic, Terrestre {
   private String family, name;
    private int age;
   private boolean isMammal;
public Animal(String family,String name,int age,boolean isMammal){
    this.name=name;
    this.family=family;
    this.age=age;
    this.isMammal=isMammal;
}

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    if (age<0)
        System.out.println("the age must be a positive number");
    else
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    @Override
    public String toString() {
        return "Animal{ Family:" + family + ", Name: " + name + ", Age: " + age + ", isMammal: " + isMammal + "}";
    }
}
