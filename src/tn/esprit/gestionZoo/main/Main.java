package tn.esprit.gestionZoo.main;
import tn.esprit.gestionZoo.Exception.InvalidAgeException;
import tn.esprit.gestionZoo.Exception.ZooFullException;

import tn.esprit.gestionZoo.entities.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ZooManagement zoo=new ZooManagement();
        System.out.println(zoo.Zooname +"comporte" + zoo.nbrCages +"cages");
        Animal lion = new Animal("family", "name", 10, true);
        Zoo myZoo=new Zoo( "belvidére","tunis",20);
        Animal tigre =new Animal("mammal","tigre",11,true);
        Zoo z1=new Zoo("chat","belvidére",25);

        Zoo z2 =new Zoo("chien","belvidére",20);
        Animal torture=new Animal("mammal","torture",-1, false);
        myZoo.display();
//        System.out.println(myZoo);
//        System.out.println(myZoo.toString());
//        System.out.println(z1. addAnimal(lion));
//        System.out.println(z1.addAnimal(torture));
//        System.out.println(z1.addAnimal(tigre));

        System.out.println(myZoo.removeAnimal(lion));
        System.out.println(Zoo.comparerZoo(z1,z2));


       // Aquatic a1=new Aquatic("fish","bouri",2,false,"sea");
        Terrestre t1=new Terrestre("panda","narla",3,true,2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true,"ocean",15.1f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 24.3f);


        //a1.swim();
        penguin.swim();
        dolphin.swim();

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        dolphin.swim();
        penguin.swim();
        try{
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tigre);
            myZoo.addAnimal(new Animal("lions","lion",5,true));
            myZoo.addAnimal(new Animal("tigers","tigre",2,true));

        }catch (ZooFullException e){
            System.out.println(e.getMessage());
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(myZoo.getNbrAnimals());
        }
        Zoo myZoo2 = new Zoo("WaterPark", "Siliana",15);
        try{ myZoo2.addAnimal(lion);
        }catch(ZooFullException e){
            System.out.println(e.getMessage());
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println(myZoo2.getNbrAnimals());
        }




    }



}