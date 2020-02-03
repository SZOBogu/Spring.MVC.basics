package example;

public class Greeting {

    private long id;
    private String content;
    private String author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Greeting doSomething(){
        this.setAuthor(this.getAuthor().toUpperCase());
        this.setContent("Treść posta:\n" + this.getContent() + " gitara bęc.");
        this.setId(this.getId() + 1);
        return this;
    }
}