package com.xiaoniu.user.controller;

import com.xiaoniu.feign.feignapi.business.SysUserBusiness;
import com.xiaoniu.feign.feignapi.domain.SysUserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author ChenChao
 * @Description:
 * @email 386474106@qq.com
 * @date 2019/9/23 16:47
 */
@RestController
@RequestMapping("/sys")
public class SysUserController {

    @Autowired
    private SysUserBusiness sysUserBusiness;

    /**
     * 查询用户信息集合
     * @param map 查询参数
     * @return
     */
    @GetMapping("/list")
    public List<SysUserDO> findSysUserList(@RequestParam Map<String,Object> map) {
        return sysUserBusiness.findSysUserList(map);
    }

}
