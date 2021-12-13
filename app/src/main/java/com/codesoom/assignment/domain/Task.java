package com.codesoom.assignment.domain;

import com.codesoom.assignment.storage.ListStorageEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Task extends ListStorageEntity {

    @Setter
    private String title;

    @Builder
    public Task(Long id, String title) {
        super(id);
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Task{id=%d, title=%s}", getId(), getTitle());
    }
}
