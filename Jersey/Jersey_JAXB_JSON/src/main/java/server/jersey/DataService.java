package server.jersey;

/**
 * Created by Igor on 8/15/2017.
 */

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import data.BookListType;
import data.BookType;

@Path("/bookservice")
public class DataService implements IBookService {

    // Basic CRUD operations for Book Service

    // http://localhost:8080/Jersey-JSON-IO/rest/bookservice/addbook
    @POST
    @Path("addbook")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String createOrSaveBookInfo(BookType bookType) {

        // get book information from formal arguments and inserts into database & return bookId (primary_key)
        return "New Book information saved successfully with Book_ID " + bookType.getBookId();
    }

    // http://localhost:8080/Jersey-JSON-IO/rest/bookservice/getbook/10001
    @GET
    @Path("getbook/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public BookType getBookInfo(@PathParam("id") int bookId) {

        // retrieve book information based on the id supplied in the formal argument
        BookType bookType = new BookType();
        bookType.setBookId(bookId);
        bookType.setBookName("Molecular Biology of The Gene");
        bookType.setAuthor("James D Watson");
        bookType.setCategory("Microbiology");
        return bookType;
    }

    // http://localhost:8080/Jersey-JSON-IO/rest/bookservice/updatebook
    @PUT
    @Path("updatebook")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String updateBookInfo(BookType bookType) {

        // update book info & return SUCCESS message
        return "Book information updated successfully";
    }

    // http://localhost:8080/Jersey-JSON-IO/rest/bookservice/deletebook/10003
    @DELETE
    @Path("deletebook/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_FORM_URLENCODED)
    public String deleteBookInfo(@PathParam("id") int bookId) {

        // delete book info & return SUCCESS message
        return "Book information with Book_ID " + bookId +  " deleted successfully";
    }

    // http://localhost:8080/Jersey-JSON-IO/rest/bookservice/getallbook
    @GET
    @Path("getallbook")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public BookListType getAllBookInfo() {

        // create a object of type BookListType which takes book objects in its list
        BookListType bookListType = new BookListType();

        BookType bookOne = new BookType();
        bookOne.setBookId(10002);
        bookOne.setBookName("Cellular and Molecular Immunology");
        bookOne.setAuthor("Abul K. Abbas");
        bookOne.setCategory("Immunology");
        bookListType.getBookType().add(bookOne); // add to bookListType

        BookType bookTwo = new BookType();
        bookTwo.setBookId(10003);
        bookTwo.setBookName("Medical Physiology");
        bookTwo.setAuthor("Walter F. Boron");
        bookTwo.setCategory("Physiology");
        bookListType.getBookType().add(bookTwo); // add to bookListType

        return bookListType;
    }
}