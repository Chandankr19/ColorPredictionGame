package com.catech.Color_Prediction_Game.Dto;

import java.util.List;
import java.util.Set;

import com.catech.Color_Prediction_Game.Entities.Bet;
import com.catech.Color_Prediction_Game.Entities.Payment;
import com.catech.Color_Prediction_Game.Entities.TransactionHistory;
import com.catech.Color_Prediction_Game.Entities.enums.Role;

import lombok.Data;

@Data
public class UserDto {

    private long user_id;
    private String username;
    private String email;
    private String password;
    private double balance = 0.0;
    private Set<Role> roles;
    private List<Bet> bets;
    private List<Payment> payments;
    private List<TransactionHistory> transactions;
}
