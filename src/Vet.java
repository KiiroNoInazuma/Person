import animals.Animal;

class Vet {

    void treatAnimal(Animal[] animals) {
        for (Animal ani : animals) {
            System.out.println(ani);
            System.out.println("------------------");
        }
    }
}
