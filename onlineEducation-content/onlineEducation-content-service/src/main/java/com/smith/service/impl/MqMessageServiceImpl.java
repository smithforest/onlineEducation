package com.smith.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smith.mapper.MqMessageMapper;
import com.smith.model.MqMessage;
import com.smith.service.MqMessageService;
import org.springframework.stereotype.Service;

/**
* @author adminhs
* @description 针对表【mq_message】的数据库操作Service实现
* @createDate 2024-04-07 22:41:47
*/
@Service
public class MqMessageServiceImpl extends ServiceImpl<MqMessageMapper, MqMessage>
    implements MqMessageService {

}




