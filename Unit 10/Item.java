import java.util.*;

public class Item
{
    public Item(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    // public accessor functions
    public String getName() { return name; }
    public float getPrice() { return price; }

    // private variables
    private String name;
    private float price;

    public static void main(String[] args)
    {
        System.out.println("Hello, items!\n");

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Apple", 1.5f));
        items.add(new Item("Notebook", 4.0f));
        items.add(new Item("Headphones", 20.0f));
        items.add(new Item("Water Bottle", 8.0f));

        System.out.println("items:");
        ItemCalculator.printItems(items);

        System.out.println("average price: " + ItemCalculator.averagePrice(items));
        System.out.println();

        System.out.println("most expensive item: " +
                           ItemCalculator.mostExpensiveItem(items));
        System.out.println();

        if (ItemCalculator.averagePrice(items) == 8.375f)
            System.out.println("averagePrice test passed");
        else
            System.out.println("averagePrice test failed");

        if (ItemCalculator.mostExpensiveItem(items).equals("Headphones"))
            System.out.println("mostExpensiveItem test passed");
        else
            System.out.println("mostExpensiveItem test failed");
    }
}

class ItemCalculator
{
    public static void printItems(ArrayList<Item> items)
    {
        for (Item i : items)
        {
            System.out.println(i.getName() + " costs $" +
                               i.getPrice());
        }
        System.out.println();
    }

    public static float averagePrice(ArrayList<Item> items)
    {
        float sum = 0;

        for (Item i : items)
            sum += i.getPrice();

        return sum / items.size();
    }

    public static String mostExpensiveItem(ArrayList<Item> items)
    {
        Item mostExpensive = items.get(0);

        for (Item i : items)
        {
            if (i.getPrice() > mostExpensive.getPrice())
                mostExpensive = i;
        }

        return mostExpensive.getName();
    }
}
