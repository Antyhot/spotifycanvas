package com.antoniguss.spotifycanvas.controller;


import com.antoniguss.spotifycanvas.constant.Template;
import com.antoniguss.spotifycanvas.service.SpotifyUrlService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("ALL")
@Controller
@AllArgsConstructor
public class IndexController {

	private final SpotifyUrlService spotifyUrlService;

	@GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String showIndex(final Model model) {
		model.addAttribute("url", spotifyUrlService.getAuthorizationURL());
		return Template.INDEX;
	}

}
