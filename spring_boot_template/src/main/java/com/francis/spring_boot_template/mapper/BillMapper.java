package com.francis.spring_boot_template.mapper;

import com.francis.spring_boot_template.entity.Bill;
import org.apache.ibatis.annotations.Select;

public interface BillMapper {

    @Select("select * from bill where bid = #{bid}")
    Bill getBillByBid(Integer bid);

}
