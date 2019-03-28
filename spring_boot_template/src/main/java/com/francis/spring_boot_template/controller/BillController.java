package com.francis.spring_boot_template.controller;

import com.francis.spring_boot_template.entity.Bill;
import com.francis.spring_boot_template.mapper.BillMapper;
import com.francis.spring_boot_template.serivce.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/bill/{bid}")
    public Bill getBill(@PathVariable Integer bid){
        Bill bill = billService.getBill(bid);
        return bill;
    }
}
