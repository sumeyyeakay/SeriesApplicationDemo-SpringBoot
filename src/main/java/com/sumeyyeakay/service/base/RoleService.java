package com.sumeyyeakay.service.base;

import com.sumeyyeakay.dto.RoleDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface RoleService {

    Optional<RoleDTO> findById(Long id);
    RoleDTO findByName(String name);
    List<RoleDTO> findAll();
    RoleDTO save(RoleDTO roleDTO);
    RoleDTO update(RoleDTO roleDTO);
}
