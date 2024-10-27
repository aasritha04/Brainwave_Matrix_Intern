import java.util.*;
public class Patient {
    private static int idCounter = 1000;
    private int patientId;
    private String name;
    private int age;
    private String address;

    private static Map<Integer, Patient> patientRecords = new HashMap<>();

    public Patient(String name, int age, String address) {
        this.patientId = idCounter++;
        this.name = name;
        this.age = age;
        this.address = address;
        patientRecords.put(patientId, this);
    }

    public static Patient getPatient(int id) {
        return patientRecords.get(id);
    }

    public static void displayPatients() {
        patientRecords.values().forEach(patient -> System.out.println(patient));
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
