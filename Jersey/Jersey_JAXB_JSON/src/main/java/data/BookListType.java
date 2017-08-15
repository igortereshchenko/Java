package data;

/**
 * Created by Igor on 8/15/2017.
 */
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bookType"
})
@XmlRootElement(name = "BookListType")
public class BookListType {

    @XmlElement(name = "BookType")
    protected List<BookType> bookType;

    public List<BookType> getBookType() {
        if (bookType == null) {
            bookType = new ArrayList<BookType>();
        }
        return this.bookType;
    }
}
