package com.codesoom.assignment.domain;

import com.codesoom.assignment.storage.ListStorageEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
public class Task extends ListStorageEntity {

    @Setter
    private String title;

    @Builder
    public Task(Long id, String title) {
        this.setId(id);
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Task{id=%d, title=%s}", getId(), getTitle());
    }
}