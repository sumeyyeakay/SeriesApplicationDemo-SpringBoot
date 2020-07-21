package com.sumeyyeakay.service.base;

import com.sumeyyeakay.dto.ActorsDTO;
import com.sumeyyeakay.dto.SeriesDTO;
import com.sumeyyeakay.model.Series;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SeriesService {

    List<SeriesDTO> fetchSeries(); //dizileri getir

    SeriesDTO seriesAdd(Series series, String actors);

    void seriesUpdate(Series series, String actors);

    //oyuncu parcala
    Object shredActors (String actors);
    List<SeriesDTO> seriesSearch(String name, String searchTour);

    void seriesDelete (int series);

    Series singleSeries(int id);

    List<ActorsDTO> actors (String name);

    List<SeriesDTO> seriesDesc(); //siralama

    List<SeriesDTO> seriesAsc();
}
