package tn.esprit.gestionZoo.entities;

public class Zoo {
    private Aquatic[] aquaticAnimals;
   private  Animal[] animals;
    private String name, city;
   private  final int NUMBER_OF_CAGES=25;
   private int nbrAquatics;

    public int getNbrAquatics() {
        return nbrAquatics;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public int getNUMBER_OF_CAGES() {
        return NUMBER_OF_CAGES;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    int nbrAnimals;
    public Zoo( String name,String city,int NUMBER_OF_CAGES){
        animals=new Animal[NUMBER_OF_CAGES];
        aquaticAnimals=new Aquatic[10];
        this.name=name;
        this.city=city;

    }
     public void display(){
        System.out.println("Name:" +name+",City:" +city+ ",nombre de cages:" +NUMBER_OF_CAGES);
    }

    @Override
    public String toString() {
        return "Name:" +name+",City:" +city;
    }
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }
    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName()== animals[i].getName())
                return i;
        }
        return index;
    }
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        aquaticAnimals[nbrAquatics]=aquatic;
        nbrAquatics++;
    }

        public float maxPenguinSwimmingDepth() {
            float maxDepth = 0f;
            for (int i = 0; i < nbrAquatics; i++) {
                if (aquaticAnimals[i] instanceof Penguin penguin) {
                    if (maxDepth < penguin.getSwimmingDepth())
                        maxDepth = penguin.getSwimmingDepth();
                }
            }
            return maxDepth;
        }

        public void displayNumberOfAquaticsByType() {
            int nbrPenguins = 0;
            int nbrDolphins = 0;
            for (int i = 0; i < nbrAquatics; i++) {
                if (aquaticAnimals[i] instanceof Dolphin) {
                    nbrDolphins++;
                }
                if (aquaticAnimals[i] instanceof Penguin) {
                    nbrPenguins++;
                }
            }
            System.out.println("Le Zoo " + name + " contient " + nbrDolphins + " dauphins et " + nbrPenguins + " pingouins");
        }
    }



