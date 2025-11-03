class Book {
    String ISBN;
    String bName;
    String category;
    double price;

    void setBook(String i, String n, String c, double p) {
        ISBN = i;
        bName = n;
        category = c;
        price = p;
    }

    void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Book Name: " + bName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setBook("978-1", "Java Basics", "Programming", 450.0);
        b.displayBook();
    }
}
