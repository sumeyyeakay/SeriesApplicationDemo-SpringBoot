package com.sumeyyeakay.service;

import com.sumeyyeakay.dto.RoleDTO;
import com.sumeyyeakay.mapper.RoleMapper;
import com.sumeyyeakay.repository.RoleRepository;
import com.sumeyyeakay.service.base.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapper roleMapper;


    @Override
    public Optional<RoleDTO> findById(Long id) {
        return Optional.ofNullable(roleMapper.toRoleDTO(roleRepository.findById(id).orElseThrow(EntityNotFoundException::new)));
    }

    @Override
    public RoleDTO findByName(String name) {
        return roleMapper.toRoleDTO(roleRepository.findByName(name));
    }

    @Override
    public List<RoleDTO> findAll() {
        return roleMapper.toRoleDTOList(roleRepository.findAll());
    }

    @Override
    public RoleDTO save(RoleDTO roleDTO) {
     //  roleDTO.setName(StringHelper.capitalize(roleDTO.getName()));
        roleDTO.setIsActive(true);
        return roleMapper.toRoleDTO(roleRepository.save(roleMapper.toRole(roleDTO)));
    }

    @Override
    public RoleDTO update(RoleDTO roleDTO) {
        //roleDTO.setName(StringHelper.capitalize(roleDTO.getName()));
        return roleMapper.toRoleDTO(roleRepository.save(roleMapper.toRole(roleDTO)));
    }
}
