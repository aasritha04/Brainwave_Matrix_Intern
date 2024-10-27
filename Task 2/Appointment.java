import java.util.*;

public class Appointment {
    private static List<String> appointments = new ArrayList<>();

    public static void scheduleAppointment(int patientId, String doctorName, String date, String time) {
        String appointment = "Patient ID: " + patientId + ", Doctor: " + doctorName + ", Date: " + date + ", Time: "
                + time;
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    public static void displayAppointments() {
        appointments.forEach(System.out::println);
    }
}
