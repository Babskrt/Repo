// import java.util.Scanner;
// 
// public class Order{
//    
//    private String customerName;
//    private int customerNumber;
//    private int quantityOrdered;
//    private double unitPrice;
//    private double totalPrice;
//    
//    //Getters
//    public void setCustomerName(String customerName){
//       this.customerName = customerName;
//    }
//    public void setCustomerNumber(int customerNumber){
//       this.customerNumber = customerNumber;
//    }
//    public void setQuantityOrdered(int quantityOrdered){
//       this.quantityOrdered = quantityOrdered;
//    }
//    public void setUnitPrice(double unitPrice){
//       this.unitPrice = unitPrice;
//    }
//    public void setTotalPrice(double totalPrice){
//       this.totalPrice = totalPrice;
//    }
//    
//    //Setters
//    public String getCustomerName(){
//       return customerName;
//    } 
//    public int getCustomerNumbere(){
//       return customerNumber;
//    }
//    public int getQuantityOrdered(){
//       return quantityOrdered;
//    }
//    public double getUnitPrice(){
//       return unitPrice;
//    }
//    
//    public double computePrice(){
//       totalPrice = quantityOrdered * unitPrice;
//       return totalPrice;
//    }
//    
//    public void displayOrder(){
//       System.out.println("Customer Name: " + customerName);
//       System.out.println("Customer Number: " + customerNumber);
//       System.out.println("Quantity Ordered: " + quantityOrdered);
//       System.out.println("Unit Price: $" + unitPrice);
//       System.out.println("Total Price: $" + totalPrice);
//    }
//    
//    public void inputOrderDetails(){
//       Scanner scanner = new Scanner(System.in);
//       System.out.print("Enter Customer Name: ");
//       customerName = scanner.nextLine();
//       System.out.print("Enter Customer Number: ");
//       customerNumber = scanner.nextInt();
//       System.out.print("Enter Quantity Ordered: ");
//       quantityOrdered = scanner.nextInt();
//       System.out.print("Enter Unit Price: ");
//       unitPrice = scanner.nextDouble();
//       computePrice();
//    }
// }

import java.util.Scanner;

public class Order {
   
   private String customerName;
   private int customerNumber;
   private int quantityOrdered;
   private double unitPrice;
   private double totalPrice;
   
   // Setters
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }
   
   public void setCustomerNumber(int customerNumber) {
      this.customerNumber = customerNumber;
   }
   
   public void setQuantityOrdered(int quantityOrdered) {
      this.quantityOrdered = quantityOrdered;
   }
   
   public void setUnitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
   }
   
   // Getters
   public String getCustomerName() {
      return customerName;
   } 
   
   public int getCustomerNumber() {
      return customerNumber;
   }
   
   public int getQuantityOrdered() {
      return quantityOrdered;
   }
   
   public double getUnitPrice() {
      return unitPrice;
   }
   
   public double computePrice(double unitPrice, int quantityOrdered) {
      totalPrice = quantityOrdered * unitPrice;
      return totalPrice;
   }
   
   public void displayOrder() {
   ShippedOrder shippedorder = new ShippedOrder();
      System.out.println("Customer Name: " + customerName);
      System.out.println("Customer Number: " + customerNumber);
      System.out.println("Quantity Ordered: " + quantityOrdered);
      System.out.println("Unit Price: $" + unitPrice);
      System.out.println("Total Price: $" +shippedorder.computePrice(unitPrice, quantityOrdered));
   }
   
   public void inputOrderDetails() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter Customer Name: ");
      customerName = scanner.nextLine();
      System.out.print("Enter Customer Number: ");
      customerNumber = scanner.nextInt();
      System.out.print("Enter Quantity Ordered: ");
      quantityOrdered = scanner.nextInt();
      System.out.print("Enter Unit Price: ");
      unitPrice = scanner.nextDouble();
      computePrice(unitPrice, quantityOrdered);
   }
}