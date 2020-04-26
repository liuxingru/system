package com.csdj.dao.fyq;

import com.csdj.pojo.UltrasonicImage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UltrasonicImageDao {
    @Select("SELECT * FROM ultrasonic_image WHERE certificate=#{certificate}")
    public UltrasonicImage findUI(@Param("certificate") String certificate);
}
