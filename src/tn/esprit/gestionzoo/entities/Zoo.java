package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages = 25;
    int nbrAnimals;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];

    }

    public Zoo(){
    }


    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in the Zoo:");
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrCages > z2.nbrCages)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public void setName(String name) {
        if (name.isBlank())
            System.out.println("Le nom du zoo ne peut pas être vide");
        else
            this.name = name;
    }

    public String getCity() {

        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }
    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }


    public String getName() {
        return name;
    }
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) ==-1){
            return false;
        }
        if (nbrCages == nbrAnimals){
            return false;
        }
        animals[nbrCages] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indiceAnimal = searchAnimal(animal);
        if (indiceAnimal == -1){
            return false;
        }
        for (int i = indiceAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i+1];
        }
        this.nbrAnimals--;
        animals[indiceAnimal] = null;
        return true;
    }

    public int searchAnimal(Animal animal) {
        int indiceAnimal = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName()){
                indiceAnimal = i;
            }
        } return indiceAnimal;
    }

    public void displayAnimals() {
        System.out.println("Animals in the Zoo:"+ name);
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean isZoofull() {
        return nbrCages == nbrAnimals;
    }





    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

}


