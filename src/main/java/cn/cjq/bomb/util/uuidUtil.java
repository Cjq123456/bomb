package cn.cjq.bomb.util;


import java.util.UUID;

public class uuidUtil{
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}

