package com.sumeyyeakay.mapper;

import com.sumeyyeakay.model.Actors;
import com.sumeyyeakay.dto.ActorsDTO;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ActorMapper {

    @Named("toActor")
    Actors toActor(ActorsDTO actorsDTO);

    @Named("toActorsDTO")
    ActorsDTO toActorsDTO(Actors actors);

    @IterableMapping(qualifiedByName = "toActor")
    List<Actors> toActorList (List<ActorsDTO> actorsDTOList);

    @IterableMapping(qualifiedByName = "toActorsDTO")
    List<ActorsDTO> toActorsDTOList (List<Actors> actorsList);

}
