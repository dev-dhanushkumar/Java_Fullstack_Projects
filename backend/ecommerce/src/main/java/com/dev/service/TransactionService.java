package com.dev.service;

import java.util.List;

import com.dev.model.Order;
import com.dev.model.Seller;
import com.dev.model.Transaction;

public interface TransactionService {
    
    Transaction createTransaction(Order order);
    List<Transaction> getTransactionById(Seller seller);
    List<Transaction> getAllTransactions();
}
