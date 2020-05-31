package com.vishwakarma.infrastructure.feign;

import com.vishwakarma.doman.BaseAddressProvider;
import com.vishwakarma.doman.entities.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service", url = "http://192.168.0.11:1715/")
public interface AddressProvider extends BaseAddressProvider {
    @GetMapping("/address/{houseNumber}")
    Address getAddress(@PathVariable("houseNumber") int houseNumber);
}
