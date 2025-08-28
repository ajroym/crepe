package com.majr.crepe.dao.content;

import com.majr.crepe.entity.content.Gallery;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GalleryDAOImpl implements GalleryDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Gallery findGalleryById(Long id) {
        String query = "SELECT g FROM Gallery g WHERE g.id = :id";

        TypedQuery<Gallery> galleryQuery = entityManager.createQuery(query, Gallery.class);
        galleryQuery.setParameter("id", id);

        return galleryQuery.getSingleResult();
    }

    @Override
    public List<Gallery> findAllGalleriesByUser(Long id) {
        String query = "SELECT g FROM Gallery g WHERE g.user.id = :id";

        TypedQuery<Gallery> galleryQuery = entityManager.createQuery(query, Gallery.class);
        galleryQuery.setParameter("id", id);

        return galleryQuery.getResultList();
    }

    @Transactional
    @Override
    public Gallery createGallery(Gallery gallery) {
        entityManager.persist(gallery);

        return gallery;
    }

    @Transactional
    @Override
    public Gallery updateGallery(Gallery gallery) {
        if (findGalleryById(gallery.getId()) == null) {
            // implement later
        }
        return createGallery(gallery);
    }

    @Transactional
    @Override
    public void deleteGallery(Gallery gallery) {
        entityManager.remove(gallery);
    }
}
