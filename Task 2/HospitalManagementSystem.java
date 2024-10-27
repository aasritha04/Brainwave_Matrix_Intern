import java.util.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nHospital Management System Menu:");
            System.out.println("1. Register New Patient");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. Add Health Record");
            System.out.println("4. Generate Bill");
            System.out.println("5. Add Supply");
            System.out.println("6. Register New Staff");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter name, age, and address: ");
                    String name = scanner.nextLine();
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    String address = scanner.nextLine();
                    new Patient(name, age, address);
                    break;
                case 2:
                    System.out.print("Enter Patient ID, Doctor Name, Date, and Time: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    String doctor = scanner.nextLine();
                    String date = scanner.nextLine();
                    String time = scanner.nextLine();
                    Appointment.scheduleAppointment(patientId, doctor, date, time);
                    break;
                case 3:
                    System.out.print("Enter Patient ID and Health Record: ");
                    int ehrPatientId = scanner.nextInt();
                    scanner.nextLine();
                    String record = scanner.nextLine();
                    EHR.addRecord(ehrPatientId, record);
                    break;
                case 4:
                    System.out.print("Enter Patient ID and Amount: ");
                    int billPatientId = scanner.nextInt();
                    double amount = scanner.nextDouble();
                    Billing.generateBill(billPatientId, amount);
                    break;
                case 5:
                    System.out.print("Enter Supply Item and Quantity: ");
                    String item = scanner.nextLine();
                    int quantity = scanner.nextInt();
                    Inventory.addSupply(item, quantity);
                    break;
                case 6:
                    System.out.print("Enter Staff Name and Role: ");
                    String staffName = scanner.nextLine();
                    String role = scanner.nextLine();
                    new Staff(staffName, role);
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
