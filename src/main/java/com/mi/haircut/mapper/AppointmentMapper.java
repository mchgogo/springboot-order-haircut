package com.mi.haircut.mapper;

import com.mi.haircut.domain.AppointCategory;
import com.mi.haircut.domain.Appointment;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author : Rong
 * @date : 2019/12/9
 * @Desc:
 */
public interface AppointmentMapper extends Mapper<Appointment> {

    /**
     * 用户查询预约日期和服务
     */
    List<Appointment> getAppointDateAndName(@Param("date") String date,@Param("appointName") String appointName);
}