public class Member {
    private int memberId;
    private String memberName;
    private Library library;

    public Member(int memberId, String memberName, Library library){
        this.memberId=memberId;
        this.memberName=memberName;
        this.library=library;
        System.out.println("Member with name : "+memberName+" and id : "+memberId+" added to " + library.getName());
    }

    public int getId(Member member){
        return member.memberId;
    }

    public String getName(Member member){
        return member.memberName;
    }

    public void borrowBook(String bookTitle){
        library.issueLoan(bookTitle, this.memberId);
    }

    public void returnBook(String bookTitle){
        library.returnBook(bookTitle, this);
    }

    @Override
    public String toString(){
        return getName(this) + " with ID: " + getId(this);
    }
}
