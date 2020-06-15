package com.apirest.webflux.service;

import com.apirest.webflux.document.Playlist;
import com.apirest.webflux.repository.PlaylistRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlayListServiceImpl implements PlayListService {

    @Autowired
    private PlaylistRespository respository;

    @Override
    public Flux<Playlist> findAll() {

        return respository.findAll();
    }

    @Override
    public Mono<Playlist> findById(String id) {
        return respository.findById(id);
    }

    @Override
    public Mono<Playlist> save(Playlist playlist) {
        return respository.save(playlist);
    }
}
