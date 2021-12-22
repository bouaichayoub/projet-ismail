package com.academy.coding.dao.utils;

import com.academy.coding.vo.CourseSeachVo;
import org.springframework.stereotype.Component;

@Component
public class QueryCriteriaBuilder {

    /*  public static String  queryConstruct(CourseSeachVo courseSeachVo){
        String query = "Select c from Course c Where 1";
        if (courseSeachVo != null) {
            if(courseSeachVo.getNoteMax() != null){
                query += " AND c.note < " + courseSeachVo.getNoteMax();
            }
            if(courseSeachVo.getNoteMin() != null){
                query += " AND c.note > " + courseSeachVo.getNoteMin();
            }
            if(courseSeachVo.getTitle() != null){
                query += " AND c.title = " + courseSeachVo.getTitle();
            }
        }
        return query;
    }*/


}
