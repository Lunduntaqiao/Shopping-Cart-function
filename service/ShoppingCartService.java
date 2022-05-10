package com.cpt202.xunwu.service;

import org.springframework.stereotype.Service;

import com.cpt202.xunwu.repository.ProductRepo;
import com.cpt202.xunwu.repository.ShoppingCartRepo;

import java.util.HashMap;
import java.util.Map;

import com.cpt202.xunwu.bean.ProdCart;
import com.cpt202.xunwu.bean.ComResult;
import com.cpt202.xunwu.model.Product;
import com.cpt202.xunwu.model.ShoppingCart;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShoppingCartService {

    @Autowired
    private ShoppingCartRepo shoppingCartRepo;

    @Autowired
    private ProductRepo productRepo;

    public ComResult saveCartInfo(ShoppingCart shoppingCart) {
        ComResult comResult = new ComResult();
        ShoppingCart exist_userName = shoppingCartRepo.findUserNameByUserName(shoppingCart.getUserName());
        if (exist_userName != null) {
            exist_userName.setProductCart(shoppingCart.getProductCart());
            comResult.setMessage("购物车信息已保存");
            shoppingCartRepo.save(exist_userName);
        } else {
            comResult.setMessage("购物车信息已保存");
            shoppingCartRepo.save(shoppingCart);
        }
        return comResult;
    }

    // 获取购物车中商品id
    public ComResult getProductId(String userName) {
        ComResult comResult = new ComResult();
        ShoppingCart exist_userName = shoppingCartRepo.findUserNameByUserName(userName);
        if (exist_userName != null) {
            String CatCode = exist_userName.getProductCart();
            comResult.setMessage(CatCode);
        } else {
            comResult.setMessage("");
        }
        return comResult;
    }

    public ProdCart findProductInfo(long AProductId) {
        ProdCart comproduct = new ProdCart<>(0, "", "0", 
        0, 0, "", "", "", "", "");
        Product exist_productId = productRepo.findProductIdByProductId(AProductId);
        comproduct.setProductId(AProductId);
        comproduct.setProductName(exist_productId.getProductName());
        comproduct.setProductPicture(exist_productId.getProductPicture());
        System.out.println("666666      " + exist_productId.getProductPicture());
        comproduct.setProductPrice(exist_productId.getProductPrice());
        comproduct.setProductSaleVolume(exist_productId.getProductSaleVolume());
        comproduct.setProductCategoryName(exist_productId.getProductCategoryName());
        comproduct.setProductDescription(exist_productId.getProductDescription());
        comproduct.setSeller(exist_productId.getProductPublishUserName());
        return comproduct;
    }

}
