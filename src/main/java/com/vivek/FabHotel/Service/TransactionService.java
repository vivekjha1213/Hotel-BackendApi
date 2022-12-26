package com.vivek.FabHotel.Service;

import org.springframework.http.ResponseEntity;

import com.vivek.FabHotel.Model.TransferMoney;

import java.util.Map;

public interface TransactionService {

    ResponseEntity<Object> transferMoneyToOthersWallet(TransferMoney transferMoney);

    ResponseEntity<Object> addMoneyToWallet(Map<String, Object> addMoneyToWallet);

    ResponseEntity<Object> viewAllTranscation(String mobileNo);
}
