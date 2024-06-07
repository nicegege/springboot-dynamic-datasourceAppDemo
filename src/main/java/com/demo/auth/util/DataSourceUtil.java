package com.demo.auth.util;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;

public class DataSourceUtil {
    public static String getTableNameForParkRecordSpss(){
        String dataSourceLookupKey = DynamicDataSourceContextHolder.getDataSourceLookupKey();
        if(dataSourceLookupKey.equals("spss")){
            return "t_park_record";
        }else if(dataSourceLookupKey.equals("bak")){
            return "t_park_record_spss";
        }
        return "t_park_record_spss";
    }
}
