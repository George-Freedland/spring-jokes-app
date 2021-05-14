package me.gfreedland.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String sayJoke() {
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
        return cnq.getRandomQuote();
    }
}
