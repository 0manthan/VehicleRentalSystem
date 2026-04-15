import java.sql.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        VehicleService service = new VehicleService();

        while(true)
        {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Rent Vehicle");
            System.out.println("4. Return Vehicle");
            System.out.println("5. View Rentals");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter vehicle name: ");
                    String name = sc.nextLine();
                    service.addVehicle(name);
                    break;
                case 2:
                    service.viewVehicles();
                    break;
                case 3:
                    System.out.print("Enter vehicle ID: ");
                    int vid = sc.nextInt();
                    service.rentVehicle(vid);
                    break;
                case 4:
                    System.out.print("Enter vehicle ID: ");
                    int rid = sc.nextInt();
                    service.returnVehicle(rid);
                    break;
                case 5:
                    service.viewRentals();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
