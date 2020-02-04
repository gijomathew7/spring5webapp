package web.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import web.springframework.spring5webapp.domain.Author;
import web.springframework.spring5webapp.domain.Book;
import web.springframework.spring5webapp.repositories.AuthorRepository;
import web.springframework.spring5webapp.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book book = new Book("domain driven design","1234");
        Author author =new Author("eric","evans");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);

        Book book2 = new Book("art of war","1234");
        Author author2 =new Author("sun","tzu");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books" +bookRepository.count());


    }
}
