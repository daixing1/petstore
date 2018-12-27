package com.cb.sp.petstore.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author 杨涛
 * @description TODO
 * @date 2018/12/27 17:57
 */
public class InsertCartDto implements Serializable {

    private static final long serialVersionUID = 2225911635282575951L;

    private List<String> cartIds;

    public List<String> getCartIds() {
        return cartIds;
    }

    public void setCartIds(List<String> cartIds) {
        this.cartIds = cartIds;
    }

    @Override
    public String toString() {
        return "InsertCartDto{" +
                "cartIds=" + cartIds +
                '}';
    }
}
