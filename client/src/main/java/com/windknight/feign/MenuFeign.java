package com.windknight.feign;

import com.windknight.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: wlg
 * @Date: 2019/12/23 10:36
 */
@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/menu")
    public List<Menu> findAll();
}
