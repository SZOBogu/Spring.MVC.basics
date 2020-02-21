package example;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Greeting {

    @Min(value = 0, message = "You must enter 0 or more in id field")
    private int id;
    @Size(min = 3, message = "Min 3 character content")
    private String content;
    @Size(max = 30, message = "Author name cannot be longer than 30 characters")
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}