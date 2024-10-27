import java.util.*;

public class EHR {
    private static Map<Integer, String> healthRecords = new HashMap<>();

    public static void addRecord(int patientId, String record) {
        healthRecords.put(patientId, record);
        System.out.println("Record added for Patient ID: " + patientId);
    }

    public static void viewRecord(int patientId) {
        System.out.println("Record for Patient ID " + patientId + ": " + healthRecords.get(patientId));
    }
}
