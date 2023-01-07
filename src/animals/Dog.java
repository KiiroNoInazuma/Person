package animals;

public class Dog extends Animal implements Ani {


    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public String makeNoise() {
        if (isSleep()) {
            return sleep(true);
        }
        return "ГАВ-ГАВ";
    }

    @Override
    public String eat() {
        return getName() + " кушает корм " + getFood()+".";
    }

}




