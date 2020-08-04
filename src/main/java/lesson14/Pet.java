package lesson14;

import java.util.*;

public class Pet {
    ArrayList<Pet> pets = new ArrayList<>();
    HashMap petMap = new HashMap();
    Set petSet = petMap.keySet();

    public Pet() {
    }

    public Pet(ArrayList<Pet> pets, HashMap petMap, Set petSet) {
        this.pets = pets;
        this.petMap = petMap;
        this.petSet = petSet;
    }

    public ArrayList<Pet> getPets() {

        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        
        this.pets = pets;
    }

    public HashMap getPetMap() {

        return petMap;
    }

    public void setPetMap(HashMap petMap) {
        this.petMap = petMap;
    }

    public Set getPetSet() {

        return petSet;
    }

    public void setPetSet(Set petSet) {

        this.petSet = petSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(pets, pet.pets) &&
                Objects.equals(petMap, pet.petMap) &&
                Objects.equals(petSet, pet.petSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pets, petMap, petSet);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pets=" + pets +
                ", petMap=" + petMap +
                ", petSet=" + petSet +
                '}';
    }
}
