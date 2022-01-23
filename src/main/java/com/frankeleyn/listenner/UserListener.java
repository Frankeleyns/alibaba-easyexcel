package com.frankeleyn.listenner;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.frankeleyn.pojo.User;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Frankeleyn
 * @date 2022/1/23 16:46
 */
@Slf4j
public class UserListener extends AnalysisEventListener<User>  {
    @Override
    public void invoke(User data, AnalysisContext context) {
        log.info("解析到一条数据 {}", JSON.toJSONString(data));
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成...");
    }
}
