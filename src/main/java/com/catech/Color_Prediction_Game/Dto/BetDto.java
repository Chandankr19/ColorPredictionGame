package com.catech.Color_Prediction_Game.Dto;

import java.time.LocalDateTime;

import com.catech.Color_Prediction_Game.Entities.User;

import lombok.Data;

@Data
public class BetDto {

    private long bet_id;
    private User user;
    private double amount;
    private String colorPredicted;
    private LocalDateTime dateTime;
}
