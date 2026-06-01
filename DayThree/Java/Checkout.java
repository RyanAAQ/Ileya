import java.util.Scanner;

public class CheckoutApp{
    public static void main(String... args){

    Scanner input = new Scanner(System.in);

    String[] userItems = new String[100];
    int[] items = new int[100];
    double[] price = new double[100];
    double[] total = new double[100];
    
    System.out.println("=============== WELCOME TO SEMICOLON SUPERMARKET ================");

    int index = 0;

    System.out.print("Enter customer name: ");
    String customer = input.nextLine();

    do{
    System.out.print("Enter product name: ");
    userItems[index] = input.next();

    System.out.print("Enter Item Price: ");
    price[index] = input.nextDouble();

    System.out.print("Enter quantity: ");
    items[index] = input.nextInt();

    total[index] = price[index] * items[index];
    index++;

    System.out.print("Add more items? (yes/no): ");
    String choice = input.next().toLowerCase();
    if (choice.equals("no"))
    break;

    }
    while (index < 100);

    double totalPrice = 0;
    for (int count = 0; count < index; count++){
    totalPrice += total[count];
}

    double discount = totalPrice * 0.10;
    double vat = totalPrice * 0.075;
    double billTotal = totalPrice - discount + vat;

    System.out.println("\n===== RECEIPT =====");
    System.out.println("Customer name: " + customer);

    for (int count = 0; count < index; count++) {
    System.out.println(userItems[count] + " x" + items[count] + " @ " + price[count] + " = " + total[count]);
}

    System.out.println("-------------------------");
    System.out.printf("totalPrice: %.2f\n", totalPrice);
    System.out.printf("Discount: %.2f\n", discount);
    System.out.printf("VAT (7.5%%): %.2f\n", vat);
    System.out.printf("Bill Total: %.2f\n", billTotal);

    System.out.print("Amount Paid: ");
    double paid = input.nextDouble();

    double balance = paid - billTotal;

    System.out.printf("Balance: %.2f\n", balance);
    System.out.println("==================");
    System.out.println("    THANK YOU");

    }
}
