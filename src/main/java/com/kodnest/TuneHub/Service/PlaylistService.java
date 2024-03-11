package com.kodnest.TuneHub.Service;

import java.util.List;

import com.kodnest.TuneHub.Entity.Playlist;

public interface PlaylistService  {

	public void addPlaylists(Playlist playlist);

	public List<Playlist> fetchAllPlaylist();

	

}
