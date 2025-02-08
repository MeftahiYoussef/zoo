public class Animal  {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }


    public void displayAnimalDetails() {
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Mammal: " + isMammal);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
