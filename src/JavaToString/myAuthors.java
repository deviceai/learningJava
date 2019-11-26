package JavaToString;

import java.util.StringJoiner;

public class myAuthors {
    public static void main(String[] args) {
        String[] authors = {"Mario Fusco" , "Alan Mycroft"};
        Book myBook = new Book("Java 8 & 9 in Action", 2017, authors);
        System.out.println(myBook.toString());
        myBook.joinAutors();
    }
}

class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    public StringJoiner joinAutors(){
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (String autor : this.authors){
            joiner.add(autor);
        }
        return joiner;
    }

    public String toString(){
        String joinedString = String.join(",", authors);
        return "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=" + joinedString;

        //return "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=" + joinAutors();
    }
}
