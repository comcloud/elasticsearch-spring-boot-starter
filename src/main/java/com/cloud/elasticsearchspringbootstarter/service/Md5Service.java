package com.cloud.elasticsearchspringbootstarter.service;

import com.cloud.elasticsearchspringbootstarter.util.MD5Util;

/**
 * @author 成都犀牛
 * @version version 1.0
 * @date 2020/12/10 14:41
 */
public class Md5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}
