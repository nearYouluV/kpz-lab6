import java.lang.foreign.SymbolLookup;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Basket basket = new Basket();

        basket.add(new Orange(500,  "Orange1"));
        basket.add(new Apple(200,  "Apple1"));
        basket.add(new Orange(700,  "Orange2"));
        basket.add(new Apple(250, "Apple2"));
        basket.add(new Orange(900, "Orange3"));
        basket.add(new Apple(290,  "Apple3"));

        System.out.println(basket.get(0).getName());
        System.out.println(basket.get(1).getName());
        System.out.println(basket.get(2).getName());
        System.out.println(basket.get(3).getName());

        System.out.println(basket.getFruitWithMaxWeight().getName());
        System.out.println(basket.getTotalWeight());
        main1(basket);
        System.out.println("Number of Oranges: " + basket.countFruitByName("Orange"));
        System.out.println("Number of Apples: " + basket.countFruitByName("Apple"));

        System.out.println("Number of Oranges: " + Orange.orangeCount);
        System.out.println("Number of Apples: " + Apple.appleCount);
//        System.out.println(Orange.orangeCount > Apple.appleCount);
//        Вивести кількість елемнтів з іменем Orange та Apple використовуючи статичні поля класу
    }
     public static void main1(Basket b)
     {
         b.add(new Orange(700,  "Orange4"));
         b.add(new Apple(250, "Apple4"));
     }
}
