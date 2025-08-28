package com.majr.crepe.dao.content;

import com.majr.crepe.entity.content.Upload;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UploadDAOImpl implements UploadDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Upload findUploadById(Long id) {
        String query = "SELECT u FROM Upload u WHERE u.id = :id";

        TypedQuery<Upload> uploadQuery = entityManager.createQuery(query, Upload.class);
        uploadQuery.setParameter("id", id);

        return uploadQuery.getSingleResult();
    }

    @Override
    public List<Upload> findAllUploadsByGallery(Long id) {
        String query = "SELECT u FROM Upload u WHERE u.gallery.id = :id";

        TypedQuery<Upload> uploadQuery = entityManager.createQuery(query, Upload.class);
        uploadQuery.setParameter("id", id);

        return uploadQuery.getResultList();
    }

    @Override
    public List<Upload> findAllUploadsByUser(Long id) {
        String query = "SELECT u FROM Upload u WHERE u.user.id = :id";

        TypedQuery<Upload> uploadQuery = entityManager.createQuery(query, Upload.class);
        uploadQuery.setParameter("id", id);

        return uploadQuery.getResultList();
    }

    @Transactional
    @Override
    public Upload createUpload(Upload upload) {
        entityManager.persist(upload);
        return upload;
    }

    @Transactional
    @Override
    public Upload updateUpload(Upload upload) {
        if (findUploadById(upload.getId()) == null) {
            // implement later
        }

        this.createUpload(upload);
        return upload;
    }

    @Transactional
    @Override
    public void deleteUpload(Long id) {
        Upload upload = findUploadById(id);

        if (upload != null) {
            entityManager.remove(upload);
        }
    }
}
