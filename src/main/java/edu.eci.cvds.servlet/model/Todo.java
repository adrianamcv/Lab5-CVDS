package edu.eci.cvds.servlet.model;

import java.util.*;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;

    public void setUserId(int newUserId ){
        userId=newUserId;
    }

    public int getUserId(){
        return userId;
    }

    public void setId(int newId){
        id=newId;
    }

    public int getId(){
        return id;
    }

    public void setTitle(String newTitle){
        title=newTitle;
    }

    public String getTitle(){
        return title;
    }

    public void setCompleted(boolean newCompleted){
        completed=newCompleted;
    }

    public boolean getCompleted(){
        return completed;
    }

}