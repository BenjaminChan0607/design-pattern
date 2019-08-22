package com.cs.stru.designpattern.pattern.strategy;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Set;

/**
 * @Date 2019/8/8 15:00
 * @Created by chending
 */
@Component
public class DataSourceFactory {

    @Autowired
    private Set<DataSourceHandler> set;

    Map<String, DataSourceHandler> map = Maps.newHashMap();

    @PostConstruct
    public void initDataSource() {
        try {
            for (DataSourceHandler strategy : set) {
                String key = AopTargetUtils.getTarget(strategy).getClass().getAnnotation(ProcessDataComponent.class).name();
                map.put(key, strategy);
            }
        } catch (Exception e) {

        }
    }

    public DataSourceHandler getStrategy(String name) {
        return map.get(name);
    }

}
