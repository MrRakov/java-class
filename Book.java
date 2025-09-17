public class Book {
    private String title;
    private String author;
    private double price;

    public Book (String title, String name, double price){
        this.title = title;
        author = name;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public class BookDemo{
        
        public static void main(String[] args){
            Book book1 = new Book("Developing Java Software", "Russel Winderand", 79.75);
            System.out.println(book1.title);
            System.out.println(book1.author);
    }
    }
}
