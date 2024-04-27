package com.exemple.kafka.model;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Transaction {
    private Long transactionId;
    private String transactionType;
    private Double amount;
    private Long accountId;
}
