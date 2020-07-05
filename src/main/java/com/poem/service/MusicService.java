package com.poem.service;

import com.poem.entity.PoemMusic;

import java.util.List;

public interface MusicService {
    List<PoemMusic> selectMusic(String musicName);
    PoemMusic selectMusicUrl(int id);
}
