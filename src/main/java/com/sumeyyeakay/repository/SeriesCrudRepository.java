package com.sumeyyeakay.repository;

import com.sumeyyeakay.model.Series;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesCrudRepository extends CrudRepository<Series, Integer> {
}
