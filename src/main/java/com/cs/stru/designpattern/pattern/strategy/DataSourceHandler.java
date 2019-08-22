package com.cs.stru.designpattern.pattern.strategy;

import java.util.Map;
import java.util.concurrent.Future;

/**
 * @Date 2019/8/8 14:26
 * @Created by chending
 */
public interface DataSourceHandler {

    Future<Map<String, Object>> collectUserData();

    Future<Map<String,Object>> collectProductData();
}
