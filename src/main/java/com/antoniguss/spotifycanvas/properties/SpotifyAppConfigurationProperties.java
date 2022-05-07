package com.antoniguss.spotifycanvas.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "com.antoniguss.spotifycanvas")
public class SpotifyAppConfigurationProperties {

    private String clientId;
    private String redirectUrl;

}
