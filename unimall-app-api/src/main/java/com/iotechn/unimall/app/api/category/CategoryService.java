package com.iotechn.unimall.app.api.category;

import com.iotechn.unimall.core.annotation.HttpMethod;
import com.iotechn.unimall.core.annotation.HttpOpenApi;
import com.iotechn.unimall.core.exception.ServiceException;
import com.iotechn.unimall.data.dto.CategoryDTO;

import java.util.List;

/**
 * Created by rize on 2019/7/2.
 */
@HttpOpenApi(group = "category", description = "类目服务")
public interface CategoryService {

    @HttpMethod(description = "获取类目列表")
    public List<CategoryDTO> categoryList() throws ServiceException;

}