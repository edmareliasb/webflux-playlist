package com.apirest.webflux.service;

import com.apirest.webflux.document.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlayListService {

    public Flux<Playlist> findAll();

    public Mono<Playlist> findById(String id);

    public Mono<Playlist> save(Playlist playlist);

}
