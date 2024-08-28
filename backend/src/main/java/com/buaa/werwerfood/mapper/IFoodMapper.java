package com.buaa.werwerfood.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buaa.werwerfood.entity.Food;
import com.buaa.werwerfood.entity.FoodOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface IFoodMapper extends BaseMapper<Food> {
    @Select("select * from foods where trainId=#{trainId} and date = #{date} and type = #{type}")
    List<Food> getAllFood(String trainId, String date, String type);

    @Select("select * from foods where trainId=#{trainId} and date = #{date} and type = #{type} and name = #{name}")
    Food findFoodByAllKeys(String trainId, String date, String type, String name);

    void addFoodOrder(FoodOrder foodOrder);

    @Select("select * from foodOrders where oid = #{oid}")
    List<FoodOrder> getFoodOrdersByOid(String oid);

    @Select("select * from foodOrders where trainId = #{trainId} and trainDate = #{trainDate}")
    List<FoodOrder> getFoodOrdersByTrain(String trainId, String trainDate);

//    List<Order> getTrainRelatedFoodOrders(String tid, String date, String uid);

    @Update("update foods set num = num - #{num}")
    void reduceFoodNum(Food food, int num);
}
