public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available=true;
    private int BookIdCounter=1;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
        this.bookId=BookIdCounter;
        BookIdCounter+=1;
        System.out.println("Book with Title : "+title+" and Author : "+author+" added to library");
    }

    public void issueBook(){
        this.available=false;
    }

    public String getTitle(){
        return this.title;
    }

    public boolean isAvailable(){
        return this.available;
    }

    public void returnBook(){
        this.available=true;
    }


}
