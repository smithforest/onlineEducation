package com.smith.controller;

import com.smith.base.model.PageParams;
import com.smith.base.model.PageResult;
import com.smith.dto.QueryCourseParamsDto;
import com.smith.model.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程基本信息
 */
@Api(value = "课程信息编辑接口", tags = "课程信息编辑接口")
@RestController
@RequestMapping("/course")
public class CourseBaseInfoController {
    @ApiOperation("课程查询接口")
    @GetMapping("/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParams) {
        return null;
    }
}

