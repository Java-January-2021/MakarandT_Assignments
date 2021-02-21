package com.makarand.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.makarand.lookify.models.Song;
import com.makarand.lookify.services.SongService;

@Controller
//@RestController
public class HomeController {
	// Dependency injected
	@Autowired
	private SongService sService;

	@GetMapping("/")
	public String index(Model viewModel) {
		// return this.sService.getAllSongs();
		return "lookify.jsp";
	}

//Get single song
	@GetMapping("/{id}")
	public String getSong(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("song", this.sService.getSingleSong(id));
		// return this.sService.getSingleSong(id);
		return "search.jsp";
	}
	@GetMapping("/songs/{id}")
	public String getSongById(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("song",this.sService.getSingleSong(id));
		return "details.jsp";
		
	}

	@GetMapping("/dashboard")
	public String dash(Model viewModel) {
		viewModel.addAttribute("songs", this.sService.getAllSongs());
		return "dashboard.jsp";
	}

	@GetMapping("/songs/new")
	public String getSong(@ModelAttribute("song") Song song) {
		return "addsongs.jsp";
	}

	@PostMapping("/songs/new")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "addsongs.jsp";
		} else {
			this.sService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/search/{artist}")
	public String getSongByartist(@RequestParam("artist")String artist,Model viewModel) {
		List<Song> songList= this.sService.getSongByArtist(artist);
		viewModel.addAttribute("songList",songList);
		return "search.jsp";
	}
	
	@GetMapping("/search/topten")
	public String topten(Model viewModel) {
		List<Song> topTenList =  this.sService.topTen();
		viewModel.addAttribute("abc", this.sService.topTen());
		System.out.println(topTenList);
		return "topten.jsp";
	}
	@GetMapping("/songs/{id}/delete")
	public String deleteSong(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
}
