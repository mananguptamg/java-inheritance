// Superclass Book
class Book {
    protected String title;
    protected int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author (Extending Book)
class Author extends Book {
    private String name;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Biography: " + bio);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating an Author object
        Author bookWithAuthor = new Author(
                "Core Java",
                2025,
                "James Gosling",
                "James Gosling is father of Java."
        );

        // Displaying book and author details
        System.out.println("Book Information:");
        bookWithAuthor.displayInfo();
    }
}

//SampleOutput
//Book Information:
//Book Title: Core Java
//Publication Year: 2025
//Author Name: James Gosling
//Biography: James Gosling is father of Java.


