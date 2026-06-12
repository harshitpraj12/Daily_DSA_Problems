package SearchingAndSorting;

import java.util.*;

class Item {
    int value, weight;

    Item(int v, int w) {
        value = v;
        weight = w;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int capacity) {

        // Sort by value/weight ratio (descending)
        Arrays.sort(items, (a, b) -> 
            Double.compare((double)b.value / b.weight, (double)a.value / a.weight)
        );

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                // Take full item
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                // Take fraction
                totalValue += (double)item.value * capacity / item.weight;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30),
            new Item(140, 40)
        };
        
        int capacity = 60;
        System.out.println("Maximum value: " + getMaxValue(items, capacity));
    }
}

