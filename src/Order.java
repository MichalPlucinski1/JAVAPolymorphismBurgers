public class Order {
    private Burger burger;

    private Item drink;
    private Item side;

    public Order() {
        this("regular", "coke", "fries");
    }

    public Order(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("DRINK", drinkType, 1.00);
        this.side = new Item("SIDE", sideType, 1.50);
    }


    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }






}
