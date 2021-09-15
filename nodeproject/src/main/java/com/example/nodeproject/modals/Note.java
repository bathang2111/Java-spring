package com.example.nodeproject.modals;

import com.mongodb.lang.NonNull;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Document(collection = "Note")
@Getter
@Setter

public class Note {
    @Id
    private String id;
    @NotEmpty(message = "this is required")
    private String title;
    private String description;
    private boolean isRemove = false;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
