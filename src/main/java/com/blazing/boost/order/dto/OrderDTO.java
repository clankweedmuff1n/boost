package com.blazing.boost.order.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String id;
    private String orderSid;
    private ServiceDTO service;
    private GameDTO game;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime boughtAt;
    private String completionTime;
    private String startingTime;
    private int overwrittenStartingTime;
    private OrderTypeDTO orderType;
    private String note;
    private boolean isHighPriority;
    private boolean allowedManualPick;
    private ApplyToCompleteDTO applyToComplete;
}