package org.huichuntay.personal;

import lombok.extern.slf4j.Slf4j;
import org.huichuntay.personal.models.Transaction;
import org.huichuntay.personal.services.TransactionGenerateLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class TransactionGenerator {

    public static void main(String[] args) {

        SpringApplication.run(TransactionGenerator.class, args);

        int numTransactions = 100;
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < numTransactions; i++) {
            Transaction transaction = TransactionGenerateLogic.generateTransaction();
            transactions.add(transaction);
            log.info("Transaction {}: {}", i, transaction);
        }
    }
}