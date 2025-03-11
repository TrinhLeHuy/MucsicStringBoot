package com.example.music.service;

import com.example.music.entity.Song;
import com.example.music.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    // Tạo mới hoặc lưu lại một Song
    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    // Lấy danh sách tất cả các Song
    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    // Lấy một Song theo ID
    public Optional<Song> getSongById(Long id) {
        return songRepository.findById(id);
    }

    // Cập nhật thông tin của Song có ID cho trước
    public Song updateSong(Long id, Song songDetails) {
        Song existingSong = songRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Song not found with id " + id));
        existingSong.setTitle(songDetails.getTitle());
        return songRepository.save(existingSong);
    }

    // Xoá Song theo ID
    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
}
