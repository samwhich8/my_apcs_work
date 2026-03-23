import java.util.*;

public class ItemCalculator{

static class Item{
private String name;
private float price;

public Item(String n,float p){
name=n;
price=p;
}

public String getName(){return name;}
public float getPrice(){return price;}
}

public static void printItems(ArrayList<Item> items){
for(int i=0;i<items.size();i++){
System.out.println(items.get(i).getName()+" $"+items.get(i).getPrice());
}
}

public static float averagePrice(ArrayList<Item> items){
float sum=0;
for(int i=0;i<items.size();i++){
sum=sum+items.get(i).getPrice();
}
return sum/items.size();
}

public static String mostExpensiveName(ArrayList<Item> items){
int best=0;
for(int i=0;i<items.size();i++){
if(items.get(i).getPrice()>items.get(best).getPrice()){
best=i;
}
}
return items.get(best).getName();
}

public static void testAveragePrice(){
ArrayList<Item> t=new ArrayList<Item>();
t.add(new Item("Milk",4));
t.add(new Item("Bread",2));
t.add(new Item("Eggs",6));

if(averagePrice(t)==4){
System.out.println("avg test ok");
}else{
System.out.println("avg test wrong");
}
}

public static void testMostExpensiveName(){
ArrayList<Item> t=new ArrayList<Item>();
t.add(new Item("Milk",4));
t.add(new Item("Bread",2));
t.add(new Item("Eggs",6));

if(mostExpensiveName(t).equals("Eggs")){
System.out.println("expensive ok");
}else{
System.out.println("expensive wrong");
}
}

public static void main(String[] args){

ArrayList<Item> items=new ArrayList<Item>();
items.add(new Item("Milk",4));
items.add(new Item("Bread",2));
items.add(new Item("Eggs",6));

printItems(items);

System.out.println("avg "+averagePrice(items));
System.out.println("most "+mostExpensiveName(items));

testAveragePrice();
testMostExpensiveName();
}
}

