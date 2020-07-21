package com.sumeyyeakay.repository;

import com.sumeyyeakay.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Integer> {
    public List<Series> findBySeriesNameContaining(String seriesName);
    public List<Series> findBySeriesTourContaining (String seriesTour);
}
