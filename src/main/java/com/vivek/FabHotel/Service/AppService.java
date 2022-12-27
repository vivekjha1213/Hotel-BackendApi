package com.vivek.FabHotel.Service;

import org.springframework.http.ResponseEntity;

import com.vivek.FabHotel.Model.User;

public interface AppService {

    ResponseEntity<Object> signUpForNewUsers(User user);

    ResponseEntity<Object> loginForMobileNo(String mobileNo, String password);

    ResponseEntity<Object> updateTheProfileOfExistingUser(User updatedData, String existingMobileNo);

    ResponseEntity<Object> viewTheProfile(String existingMobileNo);
}
