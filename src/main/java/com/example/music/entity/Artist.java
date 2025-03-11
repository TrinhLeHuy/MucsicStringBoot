package com.example.music.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;   // Tên nghệ sĩ
    private String genre;  // Thể loại nhạc

    @OneToMany(mappedBy = "artist")
    private List<Song> songs;

    public Artist() {
    }

    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    // Getter/Setter
    // ...
}

