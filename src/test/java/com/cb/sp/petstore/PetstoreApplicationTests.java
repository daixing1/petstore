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
        CartEntity cartEntity = cartBiz.selectById(7);
        System.out.println("cartEntity==========="+cartEntity+"=========");
    }

    @Test
    public void cartDelTest(){
        List<String> cartIds = new ArrayList<>();
        cartIds.add("1");
        cartBiz.deleteById(cartIds);
        System.out.println("cartIds==========="+cartIds+"=========");
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
        List<String> cartIds = new ArrayList<>();
        cartIds.add("7");
        Long sum = cartBiz.sumPrice(cartIds);
        System.out.println("sum==========="+sum+"=========");
    }

    @Test
    public void cartInsertTest(){
        for (int i = 1;i<=10; i++) {
            CartEntity cartEntity = new CartEntity();
            cartEntity.setProductId(i);
            cartEntity.setProductNum(i);
            cartEntity.setUserId(i);
            cartBiz.insert(cartEntity);
            System.out.println("sum===========" + cartEntity + "=========");
        }
    }

}
