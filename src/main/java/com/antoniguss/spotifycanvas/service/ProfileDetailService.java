package com.antoniguss.spotifycanvas.service;

import com.antoniguss.spotifycanvas.dto.UserDto;
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
public class ProfileDetailService {

	private final RestTemplate restTemplate;
	private static final String URL = "https://api.spotify.com/v1/me";

	public UserDto getUser(String token) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer " + token);

		HttpEntity<String> entity = new HttpEntity<>("paramters", headers);

		ResponseEntity<UserDto> response = restTemplate.exchange(URL, HttpMethod.GET, entity, UserDto.class);

        return response.getBody();
	}

	public String getUsername(String token) {
		UserDto user = getUser(token);
        System.out.println("user = " + user);
        return user.getDisplay_name();
	}

}
