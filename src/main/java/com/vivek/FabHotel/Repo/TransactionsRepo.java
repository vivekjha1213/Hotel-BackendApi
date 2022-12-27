package com.vivek.FabHotel.Repo;

import com.mongodb.client.result.UpdateResult;
import com.vivek.FabHotel.Model.TranscationHistory;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TransactionsRepo {

    void sendMoney(String senderMobileNo, String recieverMobileNo, int amountToSend);

    ResponseEntity<Object> addMoneyToWallect(String mobileNo, int amountToAdd);

    List<TranscationHistory> getAllTranscation(String mobileNo);
}
