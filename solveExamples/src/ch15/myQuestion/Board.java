package ch15.myQuestion;

public class Board {
    public String title;
    public String content;
    public String writer;

    public Board (String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public void setTitle() { this.title = title; }
    public void setContent() { this.content = content; }
    public void setWriter() { this.writer = writer; }
    public String getTitle() { return this.title; }
    public String getContent() { return this.content; }
    public String getWriter() { return this.writer; }
}
