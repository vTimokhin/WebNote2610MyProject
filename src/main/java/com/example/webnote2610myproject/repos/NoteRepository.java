package com.example.webnote2610myproject.repos;

import com.example.webnote2610myproject.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}