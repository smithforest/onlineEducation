package com.smith.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smith.mapper.MqMessageHistoryMapper;
import com.smith.model.MqMessageHistory;
import com.smith.service.MqMessageHistoryService;
import org.springframework.stereotype.Service;

/**
* @author adminhs
* @description 针对表【mq_message_history】的数据库操作Service实现
* @createDate 2024-04-07 22:41:47
*/
@Service
public class MqMessageHistoryServiceImpl extends ServiceImpl<MqMessageHistoryMapper, MqMessageHistory>
    implements MqMessageHistoryService {

}




