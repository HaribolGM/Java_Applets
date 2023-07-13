import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class project {
    // Customer class to store customer information
    public static class Customer {
        private String name;
        private int numGuests;
        private int numNights;
        private double totalCost;

        public Customer(String name, int numGuests, int numNights, double totalCost) {
            this.name = name;
            this.numGuests = numGuests;
            this.numNights = numNights;
            this.totalCost = totalCost;
        }

        public String getName() {
            return name;
        }

        public int getNumGuests() {
            return numGuests;
        }

        public int getNumNights() {
            return numNights;
        }

        public double getTotalCost() {
            return totalCost;
        }

        // Override toString method to print customer information
        public String toString() {
            return "Name: " + name + ", Number of Guests: " + numGuests + ", Number of Nights: " + numNights + ", Total Cost: $" + totalCost;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for reservation details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();
        System.out.print("Enter the number of nights: ");
        int numNights = scanner.nextInt();

        // Calculate total cost
        double roomCost = 100.0; // $100 per night
        double taxRate = 0.10; // 10% tax
        double totalCost = roomCost * numNights * numGuests * (1 + taxRate);

        // Print reservation details
        System.out.println("Reservation Details:");
        System.out.println("Name: " + name);
        System.out.println("Number of Guests: " + numGuests);
        System.out.println("Number of Nights: " + numNights);
        System.out.println("Total Cost: $" + totalCost);

        // Save reservation details to file
        try {
            File file = new File("customers.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(name + "," + numGuests + "," + numNights + "," + totalCost + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        // Read customer data from file and print to console
        try {
            File file = new File("customers.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                Customer customer = new Customer(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Double.parseDouble(data[3]));
                System.out.println(customer.toString());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }


        class projectc extends Applet {
            private double totalCost;
            private TextField amountTextField;
            private Button chargeButton;

            public projectc(double totalCost) {
                this.totalCost = totalCost;
            }

            public void init() {
                setBackground(Color.white);

                // Create text field for entering amount to charge
                amountTextField = new TextField(10);
                add(amountTextField);

                // Create button to charge amount
                chargeButton = new Button("Charge");
                chargeButton.addActionListener((ActionListener) this);
                add(chargeButton);
            }

            public void paint(Graphics g) {
                g.setFont(new Font("Arial", Font.BOLD, 20));
                g.drawString("Total Cost: $" + totalCost, 50, 50);
            }

            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountTextField.getText());
                if (amount >= totalCost) {
                    showStatus("Thank you for your payment!");
                } else {
                    showStatus("Please enter a valid amount.");
                }
            }

        }

    }
}