package com.academy.coding.service.impl;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class AbstractService <T> {

    EntityManager em;

    public List<T> getResultList(String query) {
        return getEm().createQuery(query).getResultList();
    }

    public String addConstraint(String key , Object valueMin , Object valueMax){
        String query = addConstraint(key, ">=", valueMin);
        query+= addConstraint(key, "<=", valueMax);
        return query;
    }
    public String addConstraint(String key , Object value ){
        String query = addConstraint(key, "=", value);
        return query;
    }

    public String init(Class bean){
        return init(bean,"item");
    }
    public String init(Class bean, String beanAbreviation){
        return "Select "+beanAbreviation+" From "+bean.getSimpleName() +" "+beanAbreviation+" Where 1=1";
    }

    private String addConstraint(String key , String operator , Object value){
        if (value != null && !value.toString().isEmpty()) {
            return " AND " + "item" + "."+ key +" " + operator + " '"+value.toString()+"'" ;
        }
        return "";
    }

    public abstract EntityManager getEm();
}
