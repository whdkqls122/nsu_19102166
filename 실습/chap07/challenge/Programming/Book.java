package challenge_07_programming;

public class Book {
    int price;

    Book (int price) {
        this.price = price;
    }

    void BookPrice() {
        System.out.println("Book [price=" + price + "]");
    }

    int bookPricesort() {
        return price;
    }
}
