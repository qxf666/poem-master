package com.poem.repository;
import com.poem.pojo.ResultPoem;
import java.util.List;

public interface PoemMapper {
    List<ResultPoem> selectByPoemName(String poemName);
}
