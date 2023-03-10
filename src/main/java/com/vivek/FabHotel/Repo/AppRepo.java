package com.vivek.FabHotel.Repo;

import com.mongodb.client.result.UpdateResult;
import com.vivek.FabHotel.Model.User;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public interface AppRepo {

    boolean checkIfThisMobileNoExists(String mobile);

    User saveTheDataOfNewUserInDb(User user);

    User loginForMobile(String mobileNo, String password);

    UpdateResult updateTheProfileForMobileNo(Update update, Query query);

    User getTheUserFromDb(String existingMobileNo);
}
