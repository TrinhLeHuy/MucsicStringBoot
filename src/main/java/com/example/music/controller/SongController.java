package com.example.music.controller;

import com.example.music.entity.Song;
import com.example.music.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable Long id) {
        return songRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Song createSong(@RequestBody Song song) {
        return songRepository.save(song);
    }

    // Các method PUT, DELETE tuỳ theo nhu cầu
}
