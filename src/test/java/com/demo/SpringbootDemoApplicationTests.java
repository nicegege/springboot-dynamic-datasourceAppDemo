package com.demo;

import com.alibaba.fastjson.JSON;
import com.demo.auth.entity.OcrRecord;
import com.demo.auth.entity.User;
import com.demo.auth.service.OcrRecordService;
import com.demo.auth.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootDemoApplicationTests {
    @Autowired
    UserService userService;

    @Autowired
    OcrRecordService ocrRecordService;

    @Test
    void contextLoads() {
        List<User> userList = userService.findAll();
        System.out.println(JSON.toJSONString(userList));
        List<Long> idList = new ArrayList<>();
        for (User u:userList) {
            User user = userService.insert2(u);
            System.out.println(JSON.toJSONString(user));
            idList.add(user.getId());
        }
       // userService.delete2(idList);

    }
    @Test
    void ocrRecord() {
        OcrRecord ocrRecord = ocrRecordService.queryById(1678704855845523826L);
        Integer addCount = ocrRecordService.save2(ocrRecord);
        if (addCount != null && addCount>0) {
            List list = new ArrayList();
            list.add(ocrRecord.getOcrRecordId());
            ocrRecordService.delete(list);

        }
    }

}
