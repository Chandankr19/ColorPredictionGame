package com.catech.Color_Prediction_Game.Entities;

import java.time.LocalDateTime;
import java.util.Set;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transaction_history")
@Data
public class TransactionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transaction_id;

    @Column(nullable = false)
    private double amount;

    @CreationTimestamp
    private LocalDateTime timeStamp;

    @Enumerated(EnumType.STRING)
    private Set<TransactionType> type;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
