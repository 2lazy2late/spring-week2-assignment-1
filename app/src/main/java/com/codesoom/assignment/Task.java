package com.codesoom.assignment;

/**
 * Task model, contains id and title.
 */
public class Task {
    private Long id;
    private String title;

    public Task() {
        //
    }

    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Task -> id: %s, title: %s", id, title);
    }
}
