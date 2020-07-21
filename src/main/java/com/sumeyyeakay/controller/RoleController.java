package com.sumeyyeakay.controller;


import com.sumeyyeakay.dto.RoleDTO;
import com.sumeyyeakay.service.base.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("/admin/role")
@Api(value = "Role Controller", description = "APIs that making operations about the user's roles")

public class RoleController {
    @Autowired
    private RoleService roleService;


    @GetMapping("/by-id/{id}")
    @ResponseBody
    @ApiOperation(value = "Getting role by given id")
    public Optional<RoleDTO> findById(@PathVariable("id") Long id,
                                      @RequestHeader(value = "Accept-Language", required = false) Locale locale){
            return roleService.findById(id);
    }
    @GetMapping("/all")
    @ResponseBody
    @ApiOperation(value = "Getting all roles as list")
    public List<RoleDTO> findAll(@RequestHeader(value = "Accept-Language", required = false) Locale locale){
        if(roleService.findAll().size()<1){
            System.out.println("List empty");
        }

        return roleService.findAll();
    }


}
