package com.example.nodeproject.services;

import com.example.nodeproject.modals.Note;
import com.example.nodeproject.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    NoteRepository repository;

    public List<Note> getAllNote() {
        return repository.findAllNote();
    }

    public Optional<Note> getNoteById(String id) {
        return repository.findById(id);
    }

    public String createNote(Note note) {
        repository.insert(note);
        return "Create note successful " + note.getTitle();
    }

    public String updateNote(Note note) {
        repository.save(note);
        return "Update note successful " + note.getTitle();
    }

    public String deleteNoteById(String id) {
        Optional<Note> noteDelete = repository.findById(id);
        if (noteDelete.isPresent()) {
            noteDelete.get().setRemove(true);
            repository.save(noteDelete.get());
            return "Delete note successful " + id;
        }else {
            return "Dont have any field in database";
        }
    }

    public List<Note> recoverNotes(){
        List<Note> noteDeleted =repository.findAllNoteDeleted();
        if (!noteDeleted.isEmpty()){
            System.out.println("trong ");
            noteDeleted.forEach(note -> {
                note.setRemove(false);
                repository.save(note);
            });
            return noteDeleted;
        }else {
            return noteDeleted;
        }
    }

    public List<Note> searchNoteByTitle(String q) {
        return repository.findAllByTitleRegex(q);
    }

    public List<Note> getNoteDeleted(){
        return repository.findAllNoteDeleted();
    }

}
