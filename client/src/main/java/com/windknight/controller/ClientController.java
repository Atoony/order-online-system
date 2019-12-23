package com.windknight.controller;

import com.windknight.entity.Menu;
import com.windknight.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wlg
 * @Date: 2019/12/23 10:42
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/menu")
    public List<Menu> findAll(){
        return menuFeign.findAll();
    }
}
