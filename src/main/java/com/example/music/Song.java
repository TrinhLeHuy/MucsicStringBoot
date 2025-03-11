package com.example.music;

import jakarta.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;   // Tên bài hát
    private String quality; // Chất lượng (VD: 320kbps, FLAC, ...)

    // Tham chiếu đến Album
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    // Tham chiếu đến Artist
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    // Constructors
    public Song() {
    }

    public Song(String title, String quality) {
        this.title = title;
        this.quality = quality;
    }

    // Getter/Setter
    public Long getId() {
        return id;
    }
    // ... các getter, setter cho title, quality, album, artist ...
}

