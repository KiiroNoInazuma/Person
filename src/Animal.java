abstract class Animal {
    private String food;
    private final String location;

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    String sleep(boolean bool) {
        if (bool) return "Спит";
        return "Не спит";
    }
}