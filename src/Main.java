public class Main {

    public static void main(String[] args) {

        /*Item coke = new Item("DRINK","coke", 1.50 );
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item avocado = new Item("TOPPING", "avocado", 1.50);
        avocado.printItem();



        Burger burger = new Burger("MY", 4.00);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();*/
        System.out.println("\n \n" + "-".repeat(60) + "\n"+" ".repeat(24)+"FIRST MEAL\n" + "-".repeat(60));


        Order regularMeal = new Order();
        regularMeal.addToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        System.out.println("\n \n" + "-".repeat(60) + "\n"+" ".repeat(24)+"SECOND MEAL\n" + "-".repeat(60));

        Order secondMeal = new Order("turkey", "7-up", "chili");
        secondMeal.addToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

    }

}
