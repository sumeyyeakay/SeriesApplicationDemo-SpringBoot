package com.sumeyyeakay.service.base;

import com.sumeyyeakay.dto.UsersDTO;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    UsersDTO createUser (UsersDTO usersDTO);
    UsersDTO createAdmin (UsersDTO usersDTO);


}
