package com.rhinoceros.mall.dao.dao;

import com.rhinoceros.mall.core.pojo.CartProduct;
import com.rhinoceros.mall.core.pojo.Product;
import com.rhinoceros.mall.core.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartProductDao {
    /**
     * 根据用户id找到对应购物车
     * @param userId
     * @return
     */
    List<CartProduct> findByUserId(Long userId);

    /**
     * 删除购物车商品
     * @param cartProductId
     */
    void deleteById(Long cartProductId);

    /**
     * 修改购物车每个商品的购买数量
     * @param cartProductId
     * @return
     */
    Integer updateById(@Param("productId") Long cartProductId, @Param("productNum") Integer num);
}