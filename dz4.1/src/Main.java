public class Main {
    public static void main(String[] args) {
        Printable printable[] = {new Book("Достоевский"),new Magazine("Максим"), new Book("Эрих Мария Ремарк"), new Magazine("News")};
       Book.printBooks(printable);
    }
}