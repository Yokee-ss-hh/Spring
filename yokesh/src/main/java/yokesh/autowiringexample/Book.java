package yokesh.autowiringexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	
	@Value("2 ways to earn")
	private String bookName;
	
	@Value("222")
	private Integer bookLength;
	
	@Autowired
	private Author author;

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookLength=" + bookLength + ", author=" + author + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getBookLength() {
		return bookLength;
	}

	public void setBookLength(Integer bookLength) {
		this.bookLength = bookLength;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
