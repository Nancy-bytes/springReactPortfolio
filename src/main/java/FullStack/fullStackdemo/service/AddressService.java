package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    public Address getAddressById(int id);
    public List<Address> getAddresses();
    public Address createAddress(Address address);
    public void deleteAddress(int id);

}
