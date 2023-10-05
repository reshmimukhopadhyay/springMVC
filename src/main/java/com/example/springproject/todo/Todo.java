package com.example.springproject.todo;

import java.util.Date;
import java.util.Objects;

public class Todo {
    private int id;
    private String user;
    private String description;
    private Date targetDate;
    private boolean isDone;

    public Todo(int id, String user, String description, Date targetDate, boolean isDone){
        this.id=id;
        this.user=user;
        this.description=description;
        this.targetDate=targetDate;
        this.isDone=isDone;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public void setUser(String user){
        this.user = user;
    }

    public String getUser(){
        return user;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    public void setTargetDate(Date targetDate){
        this.targetDate = targetDate;
    }

    public Date getTargetDate(){
        return targetDate;
    }

    public void setDone(boolean isDone){
        this.isDone = isDone;
    }


    public boolean getDone(){
        return isDone;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo todo)) return false;
        return getId() == todo.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
