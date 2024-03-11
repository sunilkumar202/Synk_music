package com.kodnest.TuneHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.TuneHub.Entity.Song;

public interface SongRepository extends 
JpaRepository<Song,Integer>{

	Song findByName(String name);

}
