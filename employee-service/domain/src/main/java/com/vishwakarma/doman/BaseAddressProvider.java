package com.vishwakarma.doman;

import com.vishwakarma.doman.entities.Address;

public interface BaseAddressProvider {
    Address getAddress(int houseNumber);
}
