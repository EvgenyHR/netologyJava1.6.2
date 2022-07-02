import java.util.Scanner;

public class Main {
    static String menu = "Меню - введите menu\n" +
            "Список книг - введите catalog\n" +
            "Выбрать книгу - введите номер\n" +
            "Показать характеристики книги - введите properties и затем номер книги\n" +
            "Для завершения - введите end";

    public static void main(String[] args) {
        Author author1 = new Author("Александр Грин");
        Author author2 = new Author("Л.Н. Толстой");
        Author author3 = new Author("Герман Мелвилл");

        Book book1 = new Book("1. Алые паруса", 96, 1923, author1);
        Book book2 = new Book("2. Война и Мир", 1300, 1867, author2);
        Book book3 = new Book("3. Моби Дик", 704, 1851, author3);


        String catalog = book1.name + "\n" + book2.name + "\n" + book3.name;

        Scanner scanner = new Scanner(System.in);

        System.out.println(menu);

        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else if ("menu".equals(input)) {
                System.out.println(menu);
            } else if ("catalog".equals(input)) {
                System.out.println(catalog);
            } else if ("properties".equals(input)) {
                System.out.println("номер книги: ");
                int charact = scanner.nextInt();
                switch (charact) {
                    case 1:
                        System.out.println(book1);
                        break;
                    case 2:
                        System.out.println(book2);
                        break;
                    case 3:
                        System.out.println(book3);
                        break;
                }
            }
        }
    }
}
