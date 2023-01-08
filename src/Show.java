import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Horse;

import java.util.Arrays;

public class Show {
    static Animal[] animals = new Animal[0];

    static void addAnimal(Animal animal) {
        animals = Arrays.copyOf(animals, animals.length + 1);
        animals[animals.length - 1] = animal;
    }

    public static void main(String[] args) {
        Vet vet = new Vet();

        Dog dog = new Dog("Тузик", "чаппи", "Саратов");
        Cat cat = new Cat("Мурзик", "вискас", "Москва");
        Horse horse = new Horse("Лошадка", "сено", "Уфа");

        addAnimal(horse);

        vet.treatAnimal(animals);

    }
}
