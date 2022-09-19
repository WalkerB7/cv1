import models.PizzaMenu;
import models.PizzaMenuItem;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int num = 10;
        int num2 = 15;

        int num3 = num + num2;
        if(num == num2) {

        } else if (num > num2) {

        }

        boolean b = num == num2;

        int num4 = num;
        num4 = 20;

        PizzaMenuItem pizzaMenuItem1 = new PizzaMenuItem("Hawai", 220);
        PizzaMenuItem pizzaMenuItem2 = new PizzaMenuItem("Hawai", 220);
        PizzaMenuItem pizzaMenuItem3 = pizzaMenuItem1;


        if(pizzaMenuItem1 == pizzaMenuItem2){
            System.out.println("pizza match");
        }

        if(pizzaMenuItem1 == pizzaMenuItem3){
            System.out.println("pizza 2 match");
        }
        pizzaMenuItem3.setPrice(240);
        System.out.println("price pizza item 1 " + pizzaMenuItem1.getPrice());

        int[] intArr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[][] intArr2 = new int[][]{
                {1,1},
                {1,2},
                {2,1},
                {2,2}
        };

        List<PizzaMenuItem> pizzaList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            pizzaList.add(new PizzaMenuItem("Pizza " + i, 150 + (i * 10)));
        }
        System.out.println(pizzaList.get(5));

        System.out.println("For");
        for(int i = 0; i < pizzaList.size(); i++){
            System.out.println(i + ": " + pizzaList.get(i));
        }

        System.out.println("Foreach");
        int i = 0;
        for (PizzaMenuItem pizza:
                pizzaList) {
            System.out.println(pizza);
            i++;
        }

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem("Hawai", 200));
        menu1.addItem(new PizzaMenuItem("Polo", 220));

        for(PizzaMenuItem pizza:
                menu1.getMenuItems()){
            System.out.println(pizza);
        }
        System.out.println(menu1.getLastUpdate());

        PizzaMenu menu2 = new PizzaMenu();
        menu2.addItem(new PizzaMenuItem("Hawai", 200));
        menu2.addItem(new PizzaMenuItem("Polo", 220));

        if(menu1.equals(menu2)){
            System.out.println("menu match");
        }
    }
}
