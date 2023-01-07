package animals;

public abstract class Animal implements Ani {
    private boolean sleep;
    private final String name;
    private String food;
    private final String location;

    Animal(String name, String food, String location) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    @Override
    public String sleep(boolean bool) {
        if (bool) {
            sleep = true;
            return "Животное " + getName() + " спит";
        } else {
            return "Животное " + getName() + " не спит";
        }
    }

    protected String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    protected boolean isSleep() {
        return sleep;
    }

    @Override
    public String toString() {
        return "Еда: "+food+"\nЛокация: "+location;
    }
}

