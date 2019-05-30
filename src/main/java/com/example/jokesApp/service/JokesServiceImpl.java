package com.example.jokesApp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService{
	
	private ChuckNorrisQuotes chuckQuotes;
	
	public JokesServiceImpl() {
		this.chuckQuotes = new ChuckNorrisQuotes();
	}
	
	public String getChuckJoke() {
		return chuckQuotes.getRandomQuote();
	}

}
