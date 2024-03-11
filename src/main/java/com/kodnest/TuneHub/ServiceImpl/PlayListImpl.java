package com.kodnest.TuneHub.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.TuneHub.Entity.Playlist;
import com.kodnest.TuneHub.Repository.PlayListRepository;
import com.kodnest.TuneHub.Service.PlaylistService;

@Service
public class PlayListImpl implements PlaylistService {
	@Autowired
	PlayListRepository playListRepository;

	@Override
	public void addPlaylists(Playlist playlist) {
		playListRepository.save(playlist);
	}

	@Override
	public List<Playlist> fetchAllPlaylist() {
		List<Playlist> allplaylist=playListRepository.findAll();
		return allplaylist;
	}

	
}
