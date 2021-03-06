/**
 * Created by sbmmartins on 8/3/16.
 */
public class PrintedBook extends Book {
    private double cost;

    public PrintedBook(String name, String isbn, double price, Author author, double cost) {
        super(name, isbn, price, author);
        this.cost = cost;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- Printing Cost: " + this.cost);
        System.out.println("-----------------\n");
    }

    @Override
    public boolean applyDiscount(double perc) {
        if (perc > 0.3)
            return false;
        else {
            double discount = super.getPrice() * perc;
            super.setPrice(super.getPrice() - discount);
            return true;
        }
    }
}
