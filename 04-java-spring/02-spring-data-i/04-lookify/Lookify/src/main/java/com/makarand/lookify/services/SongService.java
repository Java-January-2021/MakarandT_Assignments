package com.makarand.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.makarand.lookify.models.Song;
import com.makarand.lookify.repositories.SongRepository;

@Service
public class SongService {

	// Dependency injection

	private SongRepository sRepo;

	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}

	// Get All song
	public List<Song> getAllSongs() {
		//System.out.println(this.sRepo.findAll());
		return this.sRepo.findAll();
	}
	// Get one song
	public Song getSingleSong(Long id) {
		return this.sRepo.findById(id).orElse(null);

	}

	// Create A song
	public Song createSong(Song newSong) {
		return this.sRepo.save(newSong);
	}

	public Song createSong(String title,String artist,int rating) {
		Song newSong = new Song(title , artist, rating);
		return this.sRepo.save(newSong);
	}
	// Delete A song

	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}

	public List<Song> topTen() {
		return this.sRepo.findTop10ByOrderByRatingDesc();		
	}

	public List<Song> getSongByArtist(String artist) {
		return this.sRepo.findByArtist(artist);
			
	}

	// Update A song
//
//	public Song updateSong(Song newSong) {
//		return this.sRepo.save(newSong);
//
//	}
}
