package com.majr.crepe.dao.content;

import com.majr.crepe.entity.content.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> findAllCategories();
}
