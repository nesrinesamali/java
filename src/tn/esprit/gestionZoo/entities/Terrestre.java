package tn.esprit.gestionZoo.entities;

public final class Terrestre extends Animal{
    int nbrLegs;
    public Terrestre(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs=nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
