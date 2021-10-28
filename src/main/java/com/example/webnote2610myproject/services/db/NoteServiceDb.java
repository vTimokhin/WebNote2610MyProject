package com.example.webnote2610myproject.services.db;

import com.example.webnote2610myproject.repos.NoteRepository;
import com.example.webnote2610myproject.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceDb implements NoteService {
    @Autowired
    private NoteRepository noteRepository;
}
