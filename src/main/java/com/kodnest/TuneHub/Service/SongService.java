package com.kodnest.TuneHub.Service;

import java.util.List;

import com.kodnest.TuneHub.Entity.Song;

public interface SongService {
	public String addSong(Song song);

	public boolean songExists(String name);

	public List<Song> fetchAllSongs();

	public void updateSong(Song s);

}
