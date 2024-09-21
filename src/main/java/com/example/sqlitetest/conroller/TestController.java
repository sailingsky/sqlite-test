package com.example.sqlitetest.conroller;

import com.alibaba.fastjson2.JSON;
import com.example.sqlitetest.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")

public class TestController {

    @Autowired
    private TestMapper testMapper;

    @PostMapping("/maps")
    public String listMaps(){
        List<Map<String,Object>> result = testMapper.queryMaps();
        return JSON.toJSONString(result);
    }

}
