package com.example.nodeproject.repositories;

import com.example.nodeproject.modals.Note;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.expression.spel.ast.OpInc;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface NoteRepository extends MongoRepository<Note, String> {
    @Query("{ title : { $regex : ?0 } }")
    List<Note> findAllByTitleRegex(String q);

    @Query("{isRemove:false}")
    List<Note> findAllNote();

    @Query("{isRemove : true}")
    List<Note> findAllNoteDeleted();
}
