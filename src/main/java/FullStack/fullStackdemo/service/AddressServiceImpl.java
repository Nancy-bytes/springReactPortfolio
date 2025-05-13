package FullStack.fullStackdemo.service;

import FullStack.fullStackdemo.entity.Address;
import FullStack.fullStackdemo.exception.EntityExceptionNotFound;
import FullStack.fullStackdemo.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Override
    public Address getAddressById(@PathVariable int id) {
        return addressRepo.findById(id)
                .orElseThrow(()-> new EntityExceptionNotFound("User Not Found"));
    }
    @Override
    public List<Address> getAddresses() {
        return addressRepo.findAll();
    }
    @Override
    public Address createAddress(Address address) {
        return addressRepo.save(address);

    }
    @Override
    public void deleteAddress(int id) {
        addressRepo.deleteById(id);

    }
}
