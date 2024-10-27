import java.util.*;

public class Inventory {
    private static Map<String, Integer> supplies = new HashMap<>();

    public static void addSupply(String item, int quantity) {
        supplies.put(item, supplies.getOrDefault(item, 0) + quantity);
        System.out.println("Added " + quantity + " of " + item);
    }

    public static void checkSupply(String item) {
        System.out.println("Inventory of " + item + ": " + supplies.getOrDefault(item, 0));
    }
}
