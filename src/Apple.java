public class Apple extends Fruit {
    // Статичне поле для підрахунку кількості об'єктів типу Apple
    public static int appleCount = 0;

    public Apple(int weight, String name) {
        super(weight, name);
        appleCount++;
    }
}