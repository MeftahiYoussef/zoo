package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;


public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("aaaaaa");
        lion.setAge (8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Nahlli Park", "Ariana");
        Zoo otherMyZoo = new Zoo("firguia", "bouficha");


        Animal dog = new Animal("Rod", "Adouma", 3, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));



        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Caniche", "Fox", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        if (myZoo.isZoofull() !=true){
            System.out.println("voila on a confiermer que la zoo est vide");
        }

    }
}
