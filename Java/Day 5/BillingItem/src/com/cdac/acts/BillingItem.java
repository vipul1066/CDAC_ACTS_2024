package com.cdac.acts;
import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;
    private int quantity;

    public Item(int itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item Code: " + itemCode + ", Name: " + itemName + ", Price: $" + price + ", Stock: " + quantity;
    }
}

public class BillingItem {
    static Item[] stock = {
        new Item(101, "Laptop", 800.00, 10),
        new Item(102, "Phone", 500.00, 15),
        new Item(103, "Headphones", 50.00, 20),
        new Item(104, "Keyboard", 30.00, 25),
        new Item(105, "Mouse", 25.00, 30)
    };

    static Item[] customerCart = new Item[50];
    static int cartCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Display Stock");
            System.out.println("2. Buy Item by Item Code");
            System.out.println("3. Display Bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:{
                	System.out.println("\nAvailable Stock:");
                    for (int i = 0; i < stock.length; i++) {
                        System.out.println(stock[i]);
                    }
                }
                    break;
                    
                case 2:
                	System.out.print("Enter item code to purchase: ");
                    int itemCode = sc.nextInt();
                    Item selectedItem = null;
                    for (int i = 0; i < stock.length; i++) {
                        if (stock[i].getItemCode() == itemCode) {
                            selectedItem = stock[i];
                            break;
                        }
                    }

                    if (selectedItem == null) {
                        System.out.println("Item not found.");
                        return;
                    }
                    System.out.print("Enter quantity to purchase: ");
                    int quantity = sc.nextInt();
                    if (quantity <= selectedItem.getQuantity()) {
                        double totalCost = selectedItem.getPrice() * quantity;
                        System.out.println("Item added to cart. Total cost: $" + totalCost);

                        // Add the item to the customer cart
                        customerCart[cartCount++] = new Item(selectedItem.getItemCode(), selectedItem.getItemName(), selectedItem.getPrice(), quantity);

                        // Reduce stock quantity
                        selectedItem.setQuantity(selectedItem.getQuantity() - quantity);
                    } else {
                        System.out.println("Not enough stock available.");
                    }
                
                    break;
                    
                case 3:
                	System.out.println("\n--- Customer Bill ---");
                    double totalAmount = 0;
                    for (int i = 0; i < cartCount; i++) {
                        Item item = customerCart[i];
                        double itemTotal = item.getPrice() * item.getQuantity();
                        totalAmount += itemTotal;
                        System.out.println(item + ", Subtotal: $" + itemTotal);
                    }
                    System.out.println("Total Amount: $" + totalAmount);
                    break;
                    
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
