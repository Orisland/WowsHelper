package org.orisland.wows.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.orisland.wows.db.entity.Bind;
import org.orisland.wows.db.entity.BindExample;

public interface BindMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    long countByExample(BindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int deleteByExample(BindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long bindId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int insert(Bind row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int insertSelective(Bind row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    List<Bind> selectByExample(BindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    Bind selectByPrimaryKey(Long bindId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") Bind row, @Param("example") BindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Bind row, @Param("example") BindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Bind row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bind
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bind row);
}