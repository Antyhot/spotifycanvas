package com.antoniguss.spotifycanvas.service;


import com.antoniguss.spotifycanvas.dto.CurrentPlayingDto;
import com.antoniguss.spotifycanvas.exception.NoTrackPlayingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("ALL")
@Service
@RequiredArgsConstructor
public class CurrentPlayingService {

	private final RestTemplate restTemplate;
	private static final String URL = "https://api.spotify.com/v1/me/player/currently-playing";

	public CurrentPlayingDto getCurrentPlaying(String token) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + token);

		HttpEntity<String> entity = new HttpEntity<>("paramters", headers);

		ResponseEntity<CurrentPlayingDto> response = restTemplate.exchange(URL, HttpMethod.GET, entity, CurrentPlayingDto.class);
		if (response.getStatusCodeValue() == 204) {
			throw new NoTrackPlayingException();
		}


        System.out.println("result = " + response.getBody());
        return response.getBody();
	}

}
