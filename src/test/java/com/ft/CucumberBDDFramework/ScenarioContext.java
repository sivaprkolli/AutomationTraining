package com.ft.CucumberBDDFramework;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    Map<String, String> map;

    public ScenarioContext(){
        map = new HashMap<>();
    }

    //setContext
    //getContext

    public void setContext(String key, String value){
        map.put(key, value);
    }

    public String getContext(String key){
        return map.get(key);
    }
}
