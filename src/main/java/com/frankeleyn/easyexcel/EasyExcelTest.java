package com.frankeleyn.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.frankeleyn.listenner.UserListener;
import com.frankeleyn.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Frankeleyn
 * @date 2022/1/23 16:27
 */
public class EasyExcelTest {

    private String filename = "E:/WorkSpace/alibaba-easyexcel/write.xlsx";

    @Test
    public void testRead() {
        EasyExcel.read(filename,User.class,new UserListener()).sheet().doRead();
    }

    @Test
    public void testWrite() throws IOException {
        EasyExcel.write(filename, User.class).sheet("模板").doWrite(data());
    }

    // 写入的数据
    public List<User> data() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 65535; i++) {
            User user = new User();
            user.setName("Frankeleyn" + i);
            user.setBirthday(new Date());
            user.setSalary(Double.valueOf(i));
            userList.add(user);
        }
        return userList;
    }

}
