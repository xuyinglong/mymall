package com.emall.dao;

import com.emall.pojo.Cart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class CartMapperTest {

    ApplicationContext ctx;
    private CartMapper cartMapper;


    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        cartMapper = (CartMapper) ctx.getBean("cartMapper");
    }

        @Test
    public void testDeleteByPrimaryKey() throws Exception {
            Cart cart = new Cart();
            cart.setId(126);
            cart.setUserId(10);
            cartMapper.updateByPrimaryKey(cart);

    }

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {

    }
}