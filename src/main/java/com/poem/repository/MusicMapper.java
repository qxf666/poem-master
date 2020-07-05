package com.poem.repository;

import com.poem.entity.PoemMusic;

import java.util.List;

public interface MusicMapper {
    List<PoemMusic> SelectMusic(String musicName);
    List<PoemMusic> SelectMusicByDynasty(String dynastyName);
    PoemMusic musicUrl(int id);
}
