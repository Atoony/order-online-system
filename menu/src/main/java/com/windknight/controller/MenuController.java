package com.windknight.controller;


import com.windknight.entity.Menu;
import com.windknight.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wlg
 * @since 2019-12-17
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private IMenuService menuService;

    @GetMapping("/index")
    public String index(){
        return "menu port: "+this.port;
    }

    @GetMapping("/menu")
    public List<Menu> findAll(){
        return menuService.list();
    }
}
