package com.springframework.springdemo.GreetingExxample;

public class SpringFrame {
   private String content;
   private long id;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public SpringFrame(String content,long id){
        this.content=content;
        this.id=id;
    }
}
