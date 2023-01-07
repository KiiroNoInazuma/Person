package animals;

public class Horse extends Animal implements Ani {
    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public String makeNoise() {
        if (isSleep()) {
            return sleep(true);
        }
        return "И-ГО-ГО";
    }

    @Override
    public String eat() {
        return getName() + "кушает "+getFood()+".";
    }
}
