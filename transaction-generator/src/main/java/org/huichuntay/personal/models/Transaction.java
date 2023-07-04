package org.huichuntay.personal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String transactionId;
    private double amount;
    private Date date;
    private String sourceAccount;
    private String destinationAccount;
}
