package com.antoniguss.spotifycanvas.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Data
public class ItemDto {

    private AlbumDto album;
    private ArrayList<ArtistDto> artists;
    //Skipping available_markets, disc_number
    private Boolean explicit;
    private LinkedHashMap<String, String> external_ids;
    private LinkedHashMap<String, String> external_urls;
    private String href;
    private String id;
    private Boolean is_local;
    private String name;
    private Integer popularity;
    private String preview_url;
    private Integer track_number;
    private String type;
    private String uri;



}
