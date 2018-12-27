package com.cb.sp.petstore;

import com.cb.sp.petstore.biz.CartBiz;
import com.cb.sp.petstore.biz.ProductBiz;
import com.cb.sp.petstore.dto.CartDto;
import com.cb.sp.petstore.dto.ProductDto;
import com.cb.sp.petstore.entity.CartEntity;
import com.cb.sp.petstore.entity.ProductEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetstoreApplicationTests {

    @Autowired
    private ProductBiz productBiz;

    @Autowired
    private CartBiz cartBiz;

    @Test
    public void bizTest() {
        ProductDto productDto = new ProductDto();
        productDto.setType(1);
        List<ProductDto> productDtos = productBiz.getProductList(productDto);
        System.out.println("productDtos------------"+productDtos+"----------");
    }

    @Test
    public void productTest(){
        ProductEntity productEntity = productBiz.selectById(1);
        System.out.println("productEntity==========="+productEntity+"=========");
        CartEntity cartEntity = cartBiz.selectById(1);
        System.out.println("cartEntity==========="+cartEntity+"=========");

    }

    @Test
    public void cartTest(){
        CartEntity cartEntity = cartBiz.selectById(1);
        System.out.println("cartEntity==========="+cartEntity+"=========");
    }

    @Test
    public void cartDelTest(){
        int cartEntity = cartBiz.deleteById(1);
        System.out.println("cartEntity==========="+cartEntity+"=========");
    }

    @Test
    public void cartGetTest(){
        CartEntity cartEntity = new CartEntity();
        cartEntity.setProductId(1);
        List<CartDto> cartDtos = cartBiz.getCartList(cartEntity);
        System.out.println("cartEntity==========="+cartDtos+"=========");
    }

    @Test
    public void cartSumTest(){
        List<CartDto> cartDtos = new ArrayList<>();
        CartDto cartDto = new CartDto();
        cartDto.setPrice(2021L);
        cartDtos.add(cartDto);
        Long sum = cartBiz.sumPrice(cartDtos);
        System.out.println("sum==========="+sum+"=========");
    }

}
