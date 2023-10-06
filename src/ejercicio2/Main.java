package ejercicio2;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final LocalDao localDao = new LocalDaoImpl();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add Local");
            System.out.println("2. Get Local");
            System.out.println("3. Get All Locals");
            System.out.println("4. Update Local");
            System.out.println("5. Delete Local");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addLocal();
                    break;
                case 2:
                    getLocal();
                    break;
                case 3:
                    getAllLocals();
                    break;
                case 4:
                    updateLocal();
                    break;
                case 5:
                    deleteLocal();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addLocal() {
        System.out.print("Enter local id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter local name: ");
        String name = scanner.nextLine();
        System.out.print("Enter local category: ");
        String category = scanner.nextLine();
        System.out.print("Enter local schedule: ");
        String schedule = scanner.nextLine();

        Local local = new Local(id, name, category, schedule);
        localDao.add(local);
        System.out.println("Local added successfully!");
    }

    private static void getLocal() {
        System.out.print("Enter local id: ");
        int id = scanner.nextInt();

        Local local = localDao.get(id);
        if (local != null) {
            System.out.println(local);
        } else {
            System.out.println("Local not found!");
        }
    }

    private static void getAllLocals() {
        for (Local local : localDao.getAll()) {
            System.out.println(local);
        }
    }

    private static void updateLocal() {
        System.out.print("Enter local id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new local name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new local category: ");
        String category = scanner.nextLine();
        System.out.print("Enter new local schedule: ");
        String schedule = scanner.nextLine();

        Local local = new Local(id, name, category, schedule);
        localDao.update(local);
        System.out.println("Local updated successfully!");
    }

    private static void deleteLocal() {
        System.out.print("Enter local id: ");
        int id = scanner.nextInt();

        Local local = localDao.get(id);
        if (local != null) {
            localDao.delete(local);
            System.out.println("Local deleted successfully!");
        } else {
            System.out.println("Local not found!");
        }
    }
}

