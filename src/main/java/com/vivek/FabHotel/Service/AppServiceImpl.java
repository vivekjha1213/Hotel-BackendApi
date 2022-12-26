package com.vivek.FabHotel.Service;

import com.mongodb.client.result.UpdateResult;
import com.vivek.FabHotel.Model.User;
import com.vivek.FabHotel.Repo.AppRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    static AppRepo appRepo;


    public ResponseEntity<Object> signUpForNewUsers(User user){

        String mobile= user.getMobileNo();

        boolean checkIfMobileNoExistsInDb=appRepo.checkIfThisMobileNoExists(mobile);
        if(checkIfMobileNoExistsInDb){
            return new ResponseEntity<>("Mobile No already exists.Use Other Mobile No or Login", HttpStatus.OK);
        }
        User newUser=appRepo.saveTheDataOfNewUserInDb(user);
        return new ResponseEntity<>("New User Is succesfully saved In DB"+newUser,HttpStatus.OK);
    }

    public ResponseEntity<Object> loginForMobileNo(String mobileNo, String password) {

        User user=appRepo.loginForMobile(mobileNo,password);
        if(user==null){
            return new ResponseEntity<>("Mobile No does not Exist with This", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Successfully Login with "+user,HttpStatus.OK);
    }

    public ResponseEntity<Object> updateTheProfileOfExistingUser(User updatedData, String existingMobileNo) {

        //Feilds which you want to Update
        Update update=new Update();
        update.set("mobileNo",updatedData.getMobileNo());
        update.set("emailId",updatedData.getEmailId());
        update.set("password",updatedData.getPassword());
        update.set("firstName",updatedData.getFirstName());
        update.set("lastName",updatedData.getLastName());
        update.set("address",updatedData.getAddress());
        update.set("pincode",updatedData.getPincode());
        update.set("dOB",updatedData.getDOB());
        update.set("panCard",updatedData.getPanCard());

        //Query To find the Object stored In DB
        Query query=new Query();
        query.addCriteria(Criteria.where("mobileNo").is(existingMobileNo));

        UpdateResult updateResult=appRepo.updateTheProfileForMobileNo(update,query);
        return new ResponseEntity<>(updateResult,HttpStatus.OK);
    }

    public  ResponseEntity<Object> viewTheProfile(String existingMobileNo) {

        User user=appRepo.getTheUserFromDb(existingMobileNo);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }


}
