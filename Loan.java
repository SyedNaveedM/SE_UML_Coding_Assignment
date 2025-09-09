import java.util.Date;

public class Loan {

    private Date loanDate;
    private Date returnDate;
    private Book book;
    private Member member;

    public Loan(Date loanDate, Date returnDate, Book book, Member member){
        this.loanDate=loanDate;
        this.returnDate=returnDate;
        this.book=book;
        this.member=member;
        System.out.println("Loan issued for book : "+book.getTitle()+" to member : "+member);
    }


    public Book getBook(){
        return book;
    }

    public Member getMember(){
        return member;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }
    
}
