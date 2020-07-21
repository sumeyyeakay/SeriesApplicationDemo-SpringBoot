package com.sumeyyeakay.repository;

import com.sumeyyeakay.model.Actors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorsRepository extends JpaRepository<Actors,Integer> {
    public List<Actors> findByActorNameContaining (String actorName);

}
