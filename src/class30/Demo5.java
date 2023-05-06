package class30;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {

        ArrayList <String> drinks=new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("cook");
        drinks.add("pepsi");
        drinks.add("monster");
        drinks.add("juice");
        drinks.add("Sprite");

        for(String drink: drinks){
            if (drink.contains("a") || drink.contains("e")){
                drinks.set(drinks.indexOf(drink), "water");
            }
        }

        System.out.println(drinks);


        for (int i=0; i<drinks.size(); i++){

            if (drinks.get(i).endsWith("a")|| drinks.get(i).endsWith("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
