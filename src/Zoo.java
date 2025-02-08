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

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in the Zoo:");
    }
    boolean addAnimal(Animal animal) {
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

    boolean removeAnimal(Animal animal) {
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

    int searchAnimal(Animal animal) {
        int indiceAnimal = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name){
                indiceAnimal = i;
            }
        } return indiceAnimal;
    }

    void displayAnimals() {
        System.out.println("Animals in the Zoo:"+ name);
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    boolean isZoofull() {
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


