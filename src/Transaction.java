public class Transaction {
    // Fields (Private)
    private double totalBill;
    private final int[] priceList = { 30000, 40000, 50000 };
    private final double[] discountList = { 0, .1, .2 };
    
    // Setters and Getters (Always public)
    public void setTotalBill(int selectedItem, int selectedDiscount) {
        // Price - (Price * Discount);
        totalBill = priceList[selectedItem-1] - (priceList[selectedItem-1] * discountList[selectedDiscount-1]);
    }

    public String getTotalBill() {
        return "Php " + totalBill;
    }
}

/*
    1) iPhone 11 = 30,000 - (30,000 * .1) = 27,000
    2) iPhone 12 = 40,000
    3) iPhone 13 = 50,000

    1) DSC00 = 0%
    2) DSC00 = 10%
    3) DSC00 = 20%

    Enter item [1-3]: 1
    Enter discount [1-3]: 3
    Your total bill is: Php 0
*/