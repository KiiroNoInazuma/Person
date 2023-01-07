import animals.Dog;

public class Show {
    public static void main(String[] args) {
        Dog dog = new Dog("Тосик", "ЧАППИ", "Амстердам");
        Vet vet = new Vet();
        vet.treatAnimal(dog);
    }
}
