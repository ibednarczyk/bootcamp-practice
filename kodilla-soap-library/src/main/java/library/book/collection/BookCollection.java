package library.book.collection;

import com.kodilla.courses.soap.library.Book;
import com.kodilla.courses.soap.library.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookCollection {
    private static final Map<String, Book> library = new HashMap<>();

    @PostConstruct
    public void createLibrary(){
        Book sciFi = new Book();
        sciFi.setSignature("SCF/25/1999");
        sciFi.setAuthor("George Orwell");
        sciFi.setTitle("1984");
        sciFi.setPublicationYear(1999);
        sciFi.setGenre(Genre.SCI_FI);
        library.put(sciFi.getSignature(), sciFi);

        Book fan = new Book();
        fan.setSignature("FAN/33/2005");
        fan.setAuthor("George R.R. Martin");
        fan.setTitle("A Game of Thrones");
        fan.setPublicationYear(2005);
        fan.setGenre(Genre.FANTASY);
        library.put(fan.getSignature(), fan);

        Book crime = new Book();
        crime.setSignature("CR/212/1969");
        crime.setAuthor("Mario Puzo");
        crime.setTitle("The Godfather");
        crime.setPublicationYear(1969);
        crime.setGenre(Genre.CRIME);
        library.put(crime.getSignature(), crime);

        Book tech = new Book();
        tech.setSignature("TCH/88/2018");
        tech.setAuthor("John Carreyrou");
        tech.setTitle("Bad Blood: Secrets and Lies in a Silicon Valley Startup");
        tech.setPublicationYear(2018);
        tech.setGenre(Genre.TECH);
        library.put(tech.getSignature(), tech);

    }

    public Book findBook(String signature){
        Assert.notNull(signature, "Please, enter the right book's signature");
        return library.get(signature);
    }


}
