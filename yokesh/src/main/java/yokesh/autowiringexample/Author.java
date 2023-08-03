package yokesh.autowiringexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {
	
	@Value("yokesh")
	private String authorName;

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + "]";
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
