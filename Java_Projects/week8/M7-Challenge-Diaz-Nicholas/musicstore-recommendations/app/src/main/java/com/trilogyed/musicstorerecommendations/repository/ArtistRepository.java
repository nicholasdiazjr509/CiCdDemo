package com.trilogyed.musicstorerecommendations.repository;

import com.trilogyed.musicstorecatalog.model.Artist;
import com.trilogyed.musicstorerecommendations.model.ArtistRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistRecommendation, Integer> {
}
