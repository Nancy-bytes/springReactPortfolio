package FullStack.fullStackdemo.controller;

import FullStack.fullStackdemo.entity.Address;
import FullStack.fullStackdemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/getAddress")
    public Address getAddressById(@PathVariable int id){
        return addressService.getAddressById(id);
    }

}
