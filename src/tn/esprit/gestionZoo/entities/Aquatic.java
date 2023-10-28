package tn.esprit.gestionZoo.entities;

public abstract non-sealed   class Aquatic extends Animal{
    String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    public abstract void swim();
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;
    }
}
