package com.kodnest.TuneHub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.TuneHub.Entity.Playlist;
import com.kodnest.TuneHub.Entity.Song;
import com.kodnest.TuneHub.Service.PlaylistService;
import com.kodnest.TuneHub.Service.SongService;

@Controller
public class PlaylistController {
	@Autowired
	SongService songService;
	
	@Autowired
	PlaylistService playlistService;
	
	@GetMapping("/createplaylists")
	public String createPlaylists(Model model) {
		List<Song> songList=songService.fetchAllSongs();
		model.addAttribute("songs",songList);
		//System.out.println(songList);
		return "createplaylists";
	}
	@PostMapping("/addplaylists")
	public String addPlaylists(@ModelAttribute Playlist playlist) {
		//updating the playlist table
		playlistService.addPlaylists(playlist);
		//updating the song table
		List<Song> songList=playlist.getSongs();
		for(Song s:songList) {
			s.getPlaylists().add(playlist);
			songService.updateSong(s);
		}
		return "adminhome";
	}
	@GetMapping("/viewplaylists")
	public String viewPlaylists(Model model) {
		List<Playlist> allplaylist=playlistService.fetchAllPlaylist();
		model.addAttribute("allplaylist",allplaylist);
		//System.out.println(songList);
		return "displayplaylist";
	}
	

}
