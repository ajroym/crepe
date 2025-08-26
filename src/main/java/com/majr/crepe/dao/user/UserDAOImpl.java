package com.majr.crepe.dao.user;

import com.majr.crepe.entity.user.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDAOImpl() { }

    @Override
    public User getUserById(Long id) {
        String query = "SELECT u FROM User u WHERE u.id = :id";

        TypedQuery<User> userQuery = entityManager.createQuery(query, User.class);
        userQuery.setParameter("id", id);

        return userQuery.getSingleResult();
    }

    /*
    * This method is not to be fully implemented until
    * all app features are fully decided upon.
    * */
    @Override
    public List<User> getManyUsers() {
        return null;
    }

    @Transactional
    @Override
    public User createNewUser(User user) {
        entityManager.persist(user);

        return user;
    }

    @Transactional
    @Override
    public User updateUser(User user) {
        return createNewUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        User user = this.getUserById(id);
        entityManager.remove(user);
    }
}
