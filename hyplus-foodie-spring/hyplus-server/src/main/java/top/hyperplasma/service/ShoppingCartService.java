package top.hyperplasma.service;

import top.hyperplasma.dto.ShoppingCartDTO;
import top.hyperplasma.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    /**
     * 添加购物车
     *
     * @param shoppingCart
     */
    void addShoppingCart(ShoppingCartDTO shoppingCart);

    /**
     * 查看购物车
     *
     * @return List<ShoppingCart>
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中的一个商品
     *
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
