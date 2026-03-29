package MATH_PARAM.homeWork;

public class Task3 {

    public static void changeTitle(String[] books, String newTitle, int position) {
        books[position] = newTitle;
    }

    public static void main(String[] args) {

        String[] myBooks = {"Harry Potter", "The Lord of the Rings", "1984", "The Master and Margarita"};

        System.out.println("Before the change:");
        for (String book : myBooks) {
            System.out.println(book);
        }

        changeTitle(myBooks, "New name", 2);

        System.out.println("\nAfter change:");
        for (String book : myBooks) {
            System.out.println(book);
        }
    }
}
