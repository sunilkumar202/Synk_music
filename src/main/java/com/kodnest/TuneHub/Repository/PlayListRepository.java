package com.kodnest.TuneHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.TuneHub.Entity.Playlist;

public interface PlayListRepository extends 
JpaRepository<Playlist,Integer>{

}
