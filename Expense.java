import java.io.Serializable;

public class Expense implements Serializable {

    private int id;
    private String title;
    private double amount;
    private String category;
    private String date;

    public Expense(int id, String title, double amount, String category, String date) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public void display() {
        System.out.println(id + " | " + title + " | " + amount + " | " + category + " | " + date);
    }
}