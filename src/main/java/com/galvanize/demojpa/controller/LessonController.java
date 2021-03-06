package com.galvanize.demojpa.controller;

import com.galvanize.demojpa.model.Lesson;
import com.galvanize.demojpa.repository.LessonRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons")
public class LessonController {

    private final LessonRepository repository;

    public LessonController(LessonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public Iterable<Lesson> all() {
        return this.repository.findAll();
    }

    @PostMapping("")
    public Lesson create (@RequestBody Lesson lesson) {
        return this.repository.save(lesson);
    }


}
