package com.makarand.lookify.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makarand.lookify.models.Song;
@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
//Find all songs
	List <Song> findAll();
	
	List<Song> findTop10ByOrderByRatingDesc();
	
	List<Song> findByArtist(String artist);
	//List<Song> findByArtistContaining(String search);
	//List<Song> findTop10ByOrderByRatingDesc();

}
