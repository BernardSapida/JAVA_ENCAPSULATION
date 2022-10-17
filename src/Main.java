import java.util.Scanner;

public class Main {
    private String displayOptions = 
        "\n1) iPhone 11 = 30,000" + 
        "\n2) iPhone 12 = 40,000" + 
        "\n3) iPhone 13 = 50,000\n" + 
        "\n1) DSC00 = 0%" + 
        "\n2) DSC01 = 10%" + 
        "\n3) DSC02 = 20%\n";

    // Main
    public static void main(String[] args) throws Exception {
        // Instantiation
        Main main = new Main();
        main.startTransaction();
    }

    // Methods
    public void startTransaction() {
        Scanner sc = new Scanner(System.in);
        Transaction transaction = new Transaction();

        System.out.println(displayOptions);

        System.out.print("Enter item [1-3]: ");
        int selectedItem = sc.nextInt();

        System.out.print("Enter discount code [1-3]: ");
        int selectedDiscount = sc.nextInt();

        // Set total bill
        transaction.setTotalBill(selectedItem, selectedDiscount);

        // Get total bill
        System.out.println("Your total bill is: " + transaction.getTotalBill());
    }
}
