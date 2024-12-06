public class Orange extends Fruit {
    /**
     * Constructor
     * @param weight Fruit weight
     * @param name Fruit name
     */
    public static int orangeCount = 0;
    public Orange(int weight, String name)
    {
        super(weight, name);
        orangeCount++;
    }
}
