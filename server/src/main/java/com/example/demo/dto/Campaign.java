package com.example.demo.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Campaign implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer campaignId;

    private String name;

    private String status;

    private String label;

    private String finalUrl;

    private String smartPhoneUrl;

    private LocalDate startDate;

    private LocalDate endDate;

    private Integer budget;

    private Integer reqId;


}
