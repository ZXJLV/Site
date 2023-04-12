package com.taobao;

import com.taobao.service.UserinfoService;
import com.taobao.service.impl.UserinfoServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserinfoService userinfoService = new UserinfoServiceImpl();

        System.out.println(userinfoService.selectUserinfoAndShoppingcar());


    }
}

