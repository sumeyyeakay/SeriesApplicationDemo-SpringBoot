package com.sumeyyeakay.service.base;

import com.sumeyyeakay.model.Users;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    void createUser (Users user);
    void createAdmin (Users user);


}
