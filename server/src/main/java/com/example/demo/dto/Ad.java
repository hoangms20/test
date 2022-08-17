package com.example.demo.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Data
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer adId;

    private String name;

    private String status;

    private String type;

    private String destinationUrl;

    private String description;

    private String text;

    private String bannerImage;

    private String logoImage;

    private String headline;

    private String youtubeUrl;

    private Integer bidModifier;

    private Integer adgroupIndex;


}
