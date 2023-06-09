package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductionCompany {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("logo_path")
    private String logoPath;

    @JsonProperty("name")
    private String name;

    @JsonProperty("origin_country")
    private String originCountry;

    // getters and setters
}
