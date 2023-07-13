
import java.util.Scanner;

public class javaprojectstation {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String password = "1234";
            int option;
            String inputPassword;
            System.out.println("______________________");
            System.out.println("╔╗──╔══╗╔═══╗╔══╗╔╗─╔╗");
            System.out.println("║║──║╔╗║║╔══╝╚╗╔╝║╚═╝║");
            System.out.println("║║──║║║║║║╔═╗─║║─║╔╗─║");
            System.out.println("║║──║║║║║║╚╗║─║║─║║╚╗║");
            System.out.println("║╚═╗║╚╝║║╚═╝║╔╝╚╗║║─║║");
            System.out.println("╚══╝╚══╝╚═══╝╚══╝╚╝─╚╝");
            System.out.println("______________________");

            System.out.println("Enter Login to continue:");
            inputPassword = sc.next();

            if (!inputPassword.equals(password)) {
                System.out.println("Incorrect password. Exiting program.");
                System.exit(0);
            }

            System.out.println("Welcome to Journey Cost Calculator");

            int[][] prices = { {0, 200, 500, 1000, 1500, 2000},
                    {200, 0, 300, 800, 1300, 1800},
                    {500, 300, 0, 700, 1200, 1700},
                    {1000, 800, 700, 0, 500, 1000},
                    {1500, 1300, 1200, 500, 0, 700},
                    {2000, 1800, 1700, 1000, 700, 0} };

            String[] cities = {"Mumbai", "Pune", "Nagpur", "Satara", "Sangli", "Nashik"};

            System.out.println("Arriving Stations:");
            for (int i = 0; i < cities.length; i++) {
                System.out.println((i+1) + ". " + cities[i]);
            }
            System.out.println("╔══╗╔═══╗╔═══╗╔══╗╔╗╔╗╔══╗╔╗─╔╗╔═══╗");
            System.out.println("║╔╗║║╔═╗║║╔═╗║╚╗╔╝║║║║╚╗╔╝║╚═╝║║╔══╝");
            System.out.println("║╚╝║║╚═╝║║╚═╝║─║║─║║║║─║║─║╔╗─║║║╔═╗");
            System.out.println("║╔╗║║╔╗╔╝║╔╗╔╝─║║─║╚╝║─║║─║║╚╗║║║╚╗║");
            System.out.println("║║║║║║║║─║║║║─╔╝╚╗╚╗╔╝╔╝╚╗║║─║║║╚═╝║");
            System.out.println("╚╝╚╝╚╝╚╝─╚╝╚╝─╚══╝─╚╝─╚══╝╚╝─╚╝╚═══╝");


            int arrivingStation = sc.nextInt() - 1;

            System.out.println("Destinations:");
            for (int i = 0; i < cities.length; i++) {
                if (i != arrivingStation) {
                    System.out.println((i+1) + ". " + cities[i]);
                }
            }

            System.out.print("Enter your destination: ");
            int destination = sc.nextInt() - 1;

            if (arrivingStation == destination) {
                System.out.println("Arriving and destination points cannot be same.");
                System.exit(0);
            }

            System.out.println("We wish your journey goes fine from " + cities[arrivingStation] + " to " + cities[destination]);
            int cost = prices[arrivingStation][destination];
            System.out.println("Your payment from " + cities[arrivingStation] + " to " + cities[destination] + " is: Rs. " + cost);

            sc.close();
        }
    }


