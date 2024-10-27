import java.util.*;

public class Staff {
    private static int idCounter = 5000;
    private int staffId;
    private String name;
    private String role;

    private static Map<Integer, Staff> staffRecords = new HashMap<>();

    public Staff(String name, String role) {
        this.staffId = idCounter++;
        this.name = name;
        this.role = role;
        staffRecords.put(staffId, this);
    }

    public static void displayStaff() {
        staffRecords.values().forEach(staff -> System.out.println(staff));
    }

    @Override
    public String toString() {
        return "Staff ID: " + staffId + ", Name: " + name + ", Role: " + role;
    }
}
