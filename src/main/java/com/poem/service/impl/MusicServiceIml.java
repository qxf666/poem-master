package com.poem.service.impl;

import com.poem.entity.PoemMusic;
import com.poem.repository.MusicMapper;
import com.poem.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class MusicServiceIml implements MusicService {
    @Autowired
    MusicMapper musicMapper;
    public List<PoemMusic> selectMusic(String musicName) {
        List<PoemMusic> music1= musicMapper.SelectMusic(musicName);
        List<PoemMusic> music2= musicMapper.SelectMusicByDynasty(musicName);
        List<PoemMusic> musicCollection =new ArrayList<>();
       for(PoemMusic music:music1){
           musicCollection.add(music);
       }
        for(PoemMusic music:music2){
            musicCollection.add(music);
        }
        return musicCollection;
    }

    @Override
    public PoemMusic selectMusicUrl(int id) {
        return musicMapper.musicUrl(id);
    }
}
