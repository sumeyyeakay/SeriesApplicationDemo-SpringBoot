package com.sumeyyeakay.mapper;

import com.sumeyyeakay.dto.SeriesDTO;
import com.sumeyyeakay.model.Series;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeriesMapper {
    @Named("toSeries")
    Series toSeries(Series seriesDTO);;

    @Named("toSeriesDTO")
    SeriesDTO toSeriesDTO(Series series);


    @IterableMapping(qualifiedByName = "toSeries")
    List<Series> toSeriesList (List<SeriesDTO> seriesDTOList);

    @IterableMapping(qualifiedByName = "toSeriesDTO" )
    List<SeriesDTO> toSeriesDTOList(List<Series> seriesList);

}
