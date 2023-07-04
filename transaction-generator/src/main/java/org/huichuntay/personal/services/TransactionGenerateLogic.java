package org.huichuntay.personal.services;

import org.huichuntay.personal.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class TransactionGenerateLogic {
    private static final String[] ACCOUNTS = { "123456", "234567", "345678", "456789" };

    public static Transaction generateTransaction() {
        Transaction transaction = new Transaction();

        Random random = new Random();
        transaction.setTransactionId("T" + random.nextInt(1000));
        transaction.setAmount(Math.round(random.nextDouble() * 1000));
        transaction.setDate(new Date());
        transaction.setSourceAccount(ACCOUNTS[random.nextInt(ACCOUNTS.length)]);
        transaction.setDestinationAccount(ACCOUNTS[random.nextInt(ACCOUNTS.length)]);

        return transaction;
    }
}
