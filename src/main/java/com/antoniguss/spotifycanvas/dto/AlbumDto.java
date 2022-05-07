package com.antoniguss.spotifycanvas.dto;


import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Data
public class AlbumDto {

    private String album_type;
    private ArrayList<ArtistDto> artists;
    //Skipping available_markets
    private LinkedHashMap<String, String> external_urls;
    private String href;
    private String id;
    private ArrayList<ImageDto> images;
    private String name;
    private String release_date;
    //Skipping release_date_precision
    private Integer total_tracks;
    private String type;
    private String uri;



}
