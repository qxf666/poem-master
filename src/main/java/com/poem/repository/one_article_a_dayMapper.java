package com.poem.repository;

import com.poem.entity.one_article_a_day;
import com.poem.entity.one_article_a_dayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface one_article_a_dayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int countByExample(one_article_a_dayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int deleteByExample(one_article_a_dayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int insert(one_article_a_day record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int insertSelective(one_article_a_day record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    List<one_article_a_day> selectByExampleWithBLOBs(one_article_a_dayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    List<one_article_a_day> selectByExample(one_article_a_dayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") one_article_a_day record, @Param("example") one_article_a_dayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") one_article_a_day record, @Param("example") one_article_a_dayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table one_article_a_day
     *
     * @mbggenerated Mon Apr 13 20:25:16 CST 2020
     */
    int updateByExample(@Param("record") one_article_a_day record, @Param("example") one_article_a_dayExample example);
}