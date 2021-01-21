package com.mi.haircut.mapper;

import com.mi.haircut.domain.AppointCategory;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author : Rong
 * @date : 2019/12/12
 * @Desc:
 */
public interface AppointCategoryMapper extends Mapper<AppointCategory> {

    /**
     * 查询所有类别
     * @return
     */
    List<AppointCategory> appointCatselectAll();

    List<AppointCategory> findByCategoryTypeIn(@Param("idList") List<Integer> categoryTypeList);
}
