package data;

/**
 * Created by Igor on 8/15/2017.
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bookId",
        "bookName",
        "author",
        "category"
})
@XmlRootElement(name = "BookType")
public class BookType {

    protected int bookId;
    @XmlElement(required = true)
    protected String bookName;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(required = true)
    protected String category;

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int value) {
        this.bookId = value;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String value) {
        this.bookName = value;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String value) {
        this.author = value;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String value) {
        this.category = value;
    }
}
