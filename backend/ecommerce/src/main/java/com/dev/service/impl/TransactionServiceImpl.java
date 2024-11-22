package com.dev.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.model.Order;
import com.dev.model.Seller;
import com.dev.model.Transaction;
import com.dev.repository.SellerReportRepository;
import com.dev.repository.SellerRepository;
import com.dev.repository.TransactionRepository;
import com.dev.service.TransactionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;
    private final SellerRepository sellerRepository;

    @Override
    public Transaction createTransaction(Order order) {
        Seller seller = sellerRepository.findById(order.getSellerId()).get();
        
        Transaction transaction = new Transaction();
        transaction.setSeller(seller);
        transaction.setCustomer(order.getUser());
        transaction.setOrder(order);
        return  transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getTransactionById(Seller seller) {
        return transactionRepository.findBySellerId(seller.getId());
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    
}
