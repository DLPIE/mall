package com.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity entity = new BrandEntity();
//        entity.setName("dl");
//        brandService.save(entity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("descript", "华为"));
        list.forEach((a)->{
            System.out.println(a);
        });

    }

}
