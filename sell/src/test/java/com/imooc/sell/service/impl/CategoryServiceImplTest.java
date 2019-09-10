package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception{
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception{
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findBycategoryTypeIn() throws Exception{
        List<ProductCategory> productCategoryList = categoryService.findBycategoryTypeIn(Arrays.asList());
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生专享",10);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}