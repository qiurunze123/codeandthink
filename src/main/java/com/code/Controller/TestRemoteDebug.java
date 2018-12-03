package com.code.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class TestRemoteDebug {

    @RequestMapping(value="/world",produces="text/html")
    @ResponseBody
    public String Debug(){

        String parm ="";
        for (int i = 0; i <5 ; i++) {
            parm +=i;
        }
        return parm;
    }
}
