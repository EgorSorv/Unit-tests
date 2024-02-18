package hw4.book;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    /*
    У вас есть класс BookService, который использует интерфейс BookRepository
    для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService,
    используя Mockito для создания мок-объекта BookRepository.
     */

    @Test
    void testFindAllBooks() {
        BookRepository repository = mock(BookRepository.class);
        BookService service = new BookService(repository);
        InMemoryBookRepository memoryBookRepository = new InMemoryBookRepository();
        when(service.findAllBooks()).thenReturn(memoryBookRepository.findAll());

        List<Book> books = service.findAllBooks();

        assertThat(books.size()).isEqualTo(2);
    }

    @Test
    void testFindBookById() {
        BookRepository repository = mock(BookRepository.class);
        BookService service = new BookService(repository);
        InMemoryBookRepository memoryBookRepository = new InMemoryBookRepository();
        when(service.findBookById("2")).thenReturn(memoryBookRepository.findById("2"));

        Book book = service.findBookById("2");

        assertThat(book.getAuthor()).isEqualTo("Author2");
    }
}
