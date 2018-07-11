package com.cs.stru.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 9:21.
 */
public class HeroManager {

    private static HeroManager heroManager = new HeroManager();

    public Map<String,AbstractHero> heroMap;

    private HeroManager() {
        heroMap = new HashMap<String, AbstractHero>();
    }

    public static HeroManager getHeroManager() {
        return heroManager;
    }

    //该方法提供共享功能
    public AbstractHero getHero(String name) {
        AbstractHero abstractHero = heroMap.get(name);
        if (abstractHero == null) {
            if ("Liang".equals(name)) {
                abstractHero = new Liang();
            } else if ("Yu".equals(name)) {
                abstractHero = new Yu();
            }
            heroMap.put(name, abstractHero);
        }
        return heroMap.get(name);
    }
}
