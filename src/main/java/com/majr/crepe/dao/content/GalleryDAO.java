package com.majr.crepe.dao.content;

import com.majr.crepe.entity.content.Gallery;
import com.majr.crepe.entity.user.User;

import java.util.List;

public interface GalleryDAO {

    Gallery findGalleryById(Long id);
    List<Gallery> findAllGalleriesByUser(Long id);
    Gallery createGallery(Gallery gallery);
    Gallery updateGallery(Gallery gallery);
    void deleteGallery(Gallery gallery);
}
