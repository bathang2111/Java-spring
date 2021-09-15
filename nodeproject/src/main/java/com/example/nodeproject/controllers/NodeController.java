package com.example.nodeproject.controllers;

import com.example.nodeproject.modals.Note;
import com.example.nodeproject.repositories.NoteRepository;
import com.example.nodeproject.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Pageable;
import java.sql.Array;
import java.util.*;

@RestController
@RequestMapping("/api")
public class NodeController {
    @Autowired
    NoteService noteService;

    @GetMapping("/get-all")
    public List<Note> getAllNote() {
        return noteService.getAllNote();
    }

    @GetMapping("/get-note/{id}")
    public Optional<Note> getNoteById(@PathVariable(name = "id") String id) {
        return noteService.getNoteById(id);
    }

    @PostMapping("/create-note")
    public String createNote(@RequestBody @Valid Note note) {
        return noteService.createNote(note);
    }

    @PutMapping("/update-note")
    public String updateNote(@RequestBody Note note) {
        return noteService.updateNote(note);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteNote(@PathVariable(name = "id") String id) {
        return noteService.deleteNoteById(id);
    }

    @GetMapping("/search")
    public List<Note> searchNote(@RequestParam(name = "q") String q) {
        return noteService.searchNoteByTitle(q);
    }

    @GetMapping("/get-note-deleted")
    public List<Note> getNoteDeleted(){
        return noteService.getNoteDeleted();
    }

    @GetMapping("/recover-notes")
    public List<Note> recoverNotes(){
        return noteService.recoverNotes();
    }
}
