package com.academy.coding.service.impl;

public class AbstractService {

    public String addConstraint(String beanAbreviation, String key , Object value){
        if (value != null && !value.toString().isEmpty()) {
            return " AND " + beanAbreviation + "."+ key +"= '"+value.toString()+"'" ;
        }
        return "";
    }

    public String init(String bean, String beanAbreviation){
        return "Select "+beanAbreviation+" From "+bean+" "+beanAbreviation+" Where 1";
    }
}
