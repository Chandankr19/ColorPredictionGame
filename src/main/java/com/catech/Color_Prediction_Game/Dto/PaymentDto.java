package com.catech.Color_Prediction_Game.Dto;

import java.time.LocalDateTime;
import java.util.Set;

import com.catech.Color_Prediction_Game.Entities.User;
import com.catech.Color_Prediction_Game.Entities.enums.PaymentMethod;

import lombok.Data;

@Data
public class PaymentDto {

    private long payment_id;

    private double amount;
    private Set<PaymentMethod> payment_method;
    private LocalDateTime transaction_time;
    private User user;
}
