package com.antoniguss.spotifycanvas.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private String country;
    private String display_name;
    private String email;
    private LinkedHashMap<String,Boolean> explicit_content;
    private LinkedHashMap<String, String> external_urls;
    private LinkedHashMap<String, Integer> followers;
    private String href;
    private String id;
    private ArrayList<LinkedHashMap<String, String>> images;
    private String product;
    private String type;
    private String uri;


}
