package server.jersey;

/**
 * Created by Igor on 8/15/2017.
 */
import data.BookListType;
import data.BookType;

public interface IBookService {

    // Basic CRUD operations for Book Service

    public String createOrSaveBookInfo(BookType bookType);
    public BookType getBookInfo(int bookId);
    public String updateBookInfo(BookType bookType);
    public String deleteBookInfo(int bookId);
    public BookListType getAllBookInfo();
}
