package com.poem.repository;

import com.poem.entity.poem_sort;
import com.poem.entity.poem_sortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface poem_sortMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    int countByExample(poem_sortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    int deleteByExample(poem_sortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    int insert(poem_sort record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    int insertSelective(poem_sort record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    List<poem_sort> selectByExample(poem_sortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    int updateByExampleSelective(@Param("record") poem_sort record, @Param("example") poem_sortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poem_sort
     *
     * @mbggenerated Mon Apr 13 20:27:54 CST 2020
     */
    int updateByExample(@Param("record") poem_sort record, @Param("example") poem_sortExample example);
}