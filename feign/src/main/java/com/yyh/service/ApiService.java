package com.yyh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author YanYuHang
 * @create 2019-04-11-16:20
 */
@FeignClient(value = "eurekaclient")
public interface ApiService {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index();
}
