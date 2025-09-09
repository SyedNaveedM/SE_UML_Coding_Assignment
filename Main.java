public class Main{
    public static void main(String[] args) {
        Library library = new Library("City Library");

        // ADDING BOOKS
        library.addBook("Let Us C", "Yashwant Kanetkar");
        library.addBook("Digital Design", "M. Morris Mano");

        // ADDING MEMBERS
        Member member1 = library.registerMember("Alice");
        Member member2 = library.registerMember("Bob");

        // ISSUING LOANS
        member1.borrowBook("Let Us C");
        member2.borrowBook("Digital Design");
        member1.borrowBook("Digital Design"); // Will print book is not available

        // RETURNING BOOKS
        member1.returnBook("Let Us C");
        member2.returnBook("Let Us C"); // Will print no matching loan found
        member2.returnBook("Digital Design");

        // BORROWING AGAIN
        member1.borrowBook("Digital Design");

    }
}
