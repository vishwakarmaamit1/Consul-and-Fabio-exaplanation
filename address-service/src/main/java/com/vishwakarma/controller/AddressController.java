package com.vishwakarma.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Objects;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/address")
public class AddressController {

    private HashMap<Integer, Address> addressHashMap=new HashMap<>();

    @PostMapping(path = "/save")
    public Address createAddress(@RequestBody Address address){
        if(isNull(address)){
            throw new  NullPointerException();
        }
        addressHashMap.put(address.getHouseNumber(),address);
        return address;
    }

    @GetMapping(path = "/{houseNumber}")
    public Address getAddress(@PathVariable("houseNumber") int houseNumber){
        return addressHashMap.get(houseNumber);
    }

}
