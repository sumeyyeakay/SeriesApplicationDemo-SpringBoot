
package com.sumeyyeakay.service;

import com.sumeyyeakay.dto.ActorsDTO;
import com.sumeyyeakay.dto.SeriesDTO;
import com.sumeyyeakay.mapper.ActorMapper;
import com.sumeyyeakay.mapper.SeriesMapper;
import com.sumeyyeakay.model.Actors;
import com.sumeyyeakay.model.Series;
import com.sumeyyeakay.repository.ActorsRepository;
import com.sumeyyeakay.repository.SeriesRepository;
import com.sumeyyeakay.service.base.SeriesService;
import com.sumeyyeakay.utils.ListActors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
@Service
public class SeriesServiceImpl implements SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    @Autowired
    private ActorsRepository actorsRepository;

    @Autowired
    private ActorMapper actorMapper;

    @Autowired
    private SeriesMapper seriesMapper;


    @Override
    public List<SeriesDTO> fetchSeries() {
        return seriesMapper.toSeriesDTOList(seriesRepository.findAll());
    }

    @Override
    @Transactional
    public SeriesDTO seriesAdd(Series series, String actors) {
        String actorName = " ";
        Series editedSeries = new Series();

        String actorRole = "";
        if (!actors.equals("")){
            actors = actors.trim();
            String[] allActors = actors.split(",");
            List<ActorsDTO> actorsList1 = new ArrayList<>();
            Actors[] actorsList = new Actors[allActors.length];
            for (int i = 0; i < allActors.length - 1; i++) {
                Actors create = new Actors();
                if (allActors[i].contains(":")) {
                    String[] nameAndRole = allActors[i].split(":");
                    actorName = nameAndRole[0];
                    actorRole = nameAndRole[1];
                    create.setActorName(actorName);
                    create.setActorRole(actorRole);
                    actorsList[i] = create;

                } else{
                    actorName = allActors[i];
                    create.setActorName(actorName);
                    create.setActorRole("");
                    actorsList[i] = create;
                }
            }
            editedSeries.setSeriesActors(Arrays.asList(actorsList));
        }

        editedSeries.setSeriesName(series.getSeriesName());
        editedSeries.setSeriesTour(series.getSeriesTour());

        editedSeries.setSeriesBanner(series.getSeriesBanner());
        editedSeries.setSeriesLanguage(series.getSeriesLanguage());
        editedSeries.setSeriesDescription(series.getSeriesDescription());
        editedSeries.setSeriesYear(series.getSeriesYear());
        editedSeries.setActors(actors);
        return seriesMapper.toSeriesDTO(seriesRepository.save(seriesMapper.toSeries(editedSeries)));




    }

    @Override
    public void seriesUpdate(Series series, String actors) {

    }

    @Override
    public Object shredActors(String actors) {
        List<ListActors> actor = new ArrayList<>();
        String[] nameAndRole = actors.split(" , ");
        String nameRole;
        for (int i = 0; i < nameAndRole.length; i++) {
            ListActors listActors = new ListActors();
            nameRole = nameAndRole[i];
            listActors.setActorsName(nameRole);
            actor.add(listActors);
        }

        return actor;
    }

    @Override
    public List<SeriesDTO> seriesSearch(String name, String searchTour) {
        if (searchTour.equals("series")){
            List<Series> series = this.seriesRepository.findBySeriesNameContaining(name);
            return series;
        } else {
            List<Series> series = this.seriesRepository.findBySeriesTourContaining(name);
            return series;
        }

    }

    @Override
    @Transactional
    public void seriesDelete(int series) {
        seriesRepository.deleteById(series);
    }

    @Override
    @Transactional
    public Series singleSeries(int id) {
        return seriesRepository.getOne(id);
    }

    @Override
    public List<ActorsDTO> actors(String name) {
        List<Actors> actors = this.actorsRepository.findByActorNameContaining(name);
        return actors;
    }

    //azalana gore
    public Sort byDecreasing(){
     //   return new Sort(Direction.ASC, "seriesYear");
        return byIncreasing();

    }



    @Override
    public List<SeriesDTO> seriesDesc() {
        List<SeriesDTO> seriesDTOList = this.seriesRepository.findAll(byDecreasing());
        return seriesMapper.toSeriesDTOList(seriesRepository.save(seriesMapper.toSeries(se())));
    }

    public Sort byIncreasing(){
       // return new Sort (Sort.Direction.ASC, "seriesYear");
        return byIncreasing();
    }


    @Override
    public List<SeriesDTO> seriesAsc() {
        List<Series> series = this.seriesRepository.findAll(byIncreasing());
        return series;
    }

}
        */