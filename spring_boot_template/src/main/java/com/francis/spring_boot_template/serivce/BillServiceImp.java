package com.francis.spring_boot_template.serivce;

import com.francis.spring_boot_template.entity.Bill;
import com.francis.spring_boot_template.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImp implements BillService {
    @Autowired
    BillMapper billMapper;
    @Override
    public Bill getBill(Integer bid) {
        return billMapper.getBillByBid(bid);
    }
}
