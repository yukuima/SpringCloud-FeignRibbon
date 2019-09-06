package cn.js.controller.service;

import cn.js.controller.ProductApp2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest(classes = ProductApp2.class)
@RunWith(SpringRunner.class)
public class ProductServiceImplTest {

    @Resource
    private IProductService iProductService;

    @Test
    public void list() {
        System.out.println(iProductService.list());
    }
    @Test
    public void get(){
        System.out.println(iProductService.get(101));
    }
}