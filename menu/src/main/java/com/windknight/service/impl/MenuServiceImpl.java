package com.windknight.service.impl;

import com.windknight.entity.Menu;
import com.windknight.dao.MenuMapper;
import com.windknight.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wlg
 * @since 2019-12-17
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
