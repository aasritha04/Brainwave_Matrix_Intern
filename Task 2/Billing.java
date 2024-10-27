import java.util.*;

public class Billing {
    private static Map<Integer, Double> bills = new HashMap<>();

    public static void generateBill(int patientId, double amount) {
        bills.put(patientId, amount);
        System.out.println("Bill generated for Patient ID: " + patientId + ", Amount: $" + amount);
    }

    public static void viewBill(int patientId) {
        System.out.println("Bill for Patient ID " + patientId + ": $" + bills.getOrDefault(patientId, 0.0));
    }
}
