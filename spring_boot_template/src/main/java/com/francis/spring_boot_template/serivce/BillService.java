package com.francis.spring_boot_template.serivce;

import com.francis.spring_boot_template.entity.Bill;

public interface BillService {
    Bill getBill(Integer bid);
}
