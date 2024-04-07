package com.smith.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.smith.mapper.CourseTeacherMapper;
import com.smith.model.CourseTeacher;
import com.smith.service.CourseTeacherService;
import org.springframework.stereotype.Service;

/**
* @author adminhs
* @description 针对表【course_teacher(课程-教师关系表)】的数据库操作Service实现
* @createDate 2024-04-07 22:41:47
*/
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher>
    implements CourseTeacherService {

}




