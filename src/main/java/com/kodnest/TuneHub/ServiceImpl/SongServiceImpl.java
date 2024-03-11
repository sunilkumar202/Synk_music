package com.kodnest.TuneHub.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.TuneHub.Entity.Song;
import com.kodnest.TuneHub.Repository.SongRepository;
import com.kodnest.TuneHub.Service.SongService;

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	SongRepository songRepository;

	@Override
	public String addSong(Song song) {
		songRepository.save(song);
		return "Song added successfully.";
	}

	@Override
	public boolean songExists(String name) {
		Song song=songRepository.findByName(name);
		if(song==null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public List<Song> fetchAllSongs() {
		List<Song> songs=songRepository.findAll();
		return songs;
	}

	@Override
	public void updateSong(Song s) {
		songRepository.save(s);
	} 
}
