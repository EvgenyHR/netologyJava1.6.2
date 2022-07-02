public class Book {
    public Author author;
    public String name;
    public int page;
    public int year;

    public String toString() {
        return "Название: " + name + "\n" + "Количество страниц: " +
                page + "\n" + "Год издания: " + year + "\n" + "Автор: " + author;
    }

    public Book(String name, int page, int year, Author author) {
        this.name = name;
        this.page = page;
        this.year = year;
        this.author = author;

    }
}
