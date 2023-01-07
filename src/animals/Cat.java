package animals;

public class Cat extends Animal implements Ani {
    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public String makeNoise() {
        if (isSleep()) {
            return sleep(true);
        }
        return getName() + "МЯУ";
    }

    @Override
    public String eat() {
        return getName() + "кушает корм"+getFood()+".";
    }
}
