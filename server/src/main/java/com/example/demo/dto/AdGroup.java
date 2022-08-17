package com.example.demo.dto;


import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
public class AdGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer adgroupId;

    private String name;

    private String status;

    private String label;

    private String optimizedSetting;

    private Integer campaignIndex;


}
