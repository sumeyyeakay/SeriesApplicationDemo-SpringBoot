
package com.sumeyyeakay.service;

import com.sumeyyeakay.dto.RoleDTO;
import com.sumeyyeakay.dto.UsersDTO;
import com.sumeyyeakay.mapper.UserMapper;
import com.sumeyyeakay.model.Role;
import com.sumeyyeakay.model.Users;
import com.sumeyyeakay.repository.UserRepository;
import com.sumeyyeakay.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UsersDTO createUser(UsersDTO usersDTO) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        usersDTO.setPassword(encoder.encode(usersDTO.getPassword()));

        //    Role userRole = new Role("USER");
        List<Role> roles = new ArrayList<>();
        //    roles.add(userRole);
        //   usersDTO.setRoleFk(roles);

        //  userRepository.save(usersDTO);
    }

    @Override
    public UsersDTO createAdmin(UsersDTO usersDTO) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        usersDTO.setPassword(encoder.encode(usersDTO.getPassword()));

        // Role userRole = new Role("ADMIN");
        List<RoleDTO> roles = new ArrayList<>();
       //roles.add(userRole);
        // usersDTO.setRoleFk(roles);
        //  return userMapper.toUserDTO(userRepository.save(userMapper.toUser(usersDTO));

    }
}
 */
