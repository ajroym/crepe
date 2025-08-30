package com.majr.crepe.dao.content;

import com.majr.crepe.entity.content.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Category> findAllCategories() {
        String query = "SELECT c FROM Category c";
        TypedQuery<Category> categoryQuery = entityManager.createQuery(query, Category.class);

        return categoryQuery.getResultList();
    }
}
