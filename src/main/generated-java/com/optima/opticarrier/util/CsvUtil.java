package com.optima.opticarrier.util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class CsvUtil {

    public static String makeCsv(Object object, String[] fields){

        StringBuilder sb = new StringBuilder();
        BeanWrapper beanWrapper = new BeanWrapperImpl(object);

        for (int i = 0; i < fields.length; i++) {

            if(i != 0){
                sb.append(";");
            }

            String field = fields[i];
            sb.append("\"");

            Object val;

            if(beanWrapper.getPropertyDescriptor(field).getPropertyType().equals(Boolean.class)){
                val = (Boolean)beanWrapper.getPropertyValue(field) ? "1": "0";
            } else {
                val = beanWrapper.getPropertyValue(field);
            }
            sb.append(val);
            sb.append("\"");
        }
        return sb.toString();
    }
}
