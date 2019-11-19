package com.example.demo.dao;

import com.example.demo.entity.RateGame;
import org.apache.ibatis.annotations.Param;

public interface RateGameMapper {
    int deleteByPrimaryKey(@Param("gameId") Integer gameId, @Param("userId") Integer userId);

    int insert(RateGame record);

    int insertSelective(RateGame record);

    RateGame selectByPrimaryKey(@Param("gameId") Integer gameId, @Param("userId") Integer userId);

    int updateByPrimaryKeySelective(RateGame record);

    int updateByPrimaryKey(RateGame record);
}