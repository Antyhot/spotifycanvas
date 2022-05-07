package com.antoniguss.spotifycanvas.dto;


import lombok.Data;

@Data
public class CurrentPlayingDto {

    private Long timestamp;
    private String context;
    private Integer progress_ms;
    private ItemDto item;
    private String currently_playing_type;
    //Skipping actions
    private Boolean is_playing;

}
