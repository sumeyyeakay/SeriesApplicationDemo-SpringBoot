package com.sumeyyeakay.mapper;

import com.sumeyyeakay.model.Users;
import com.sumeyyeakay.dto.UsersDTO;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")

public interface UserMapper {
    @Named("toUser")
    Users toUser(UsersDTO userDTO);

    @Named("toUserDTO")
    UsersDTO toUserDTO(Users user);

    @IterableMapping(qualifiedByName = "toUser")
    List<Users> toUserList(List<UsersDTO> userDTOList);

    @IterableMapping(qualifiedByName = "toUserDTO")
    List<UsersDTO> toUserDTOList(List<Users> userList);
}
