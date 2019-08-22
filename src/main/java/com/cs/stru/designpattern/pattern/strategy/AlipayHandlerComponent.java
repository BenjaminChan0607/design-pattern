package com.cs.stru.designpattern.pattern.strategy;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.Future;

/**
 * @Date 2019/8/8 15:06
 * @Created by chending
 */
@ProcessDataComponent(name = "AlipayHandlerComponent")
@Component
public class AlipayHandlerComponent implements DataSourceHandler {
    @Override
    public Future<Map<String, Object>> collectUserData() {
        return null;
    }

    @Override
    public Future<Map<String, Object>> collectProductData() {
        return null;
    }
}
