package com.majr.crepe.dao.content;

import com.majr.crepe.entity.content.Upload;

import java.util.List;

public interface UploadDAO {

    Upload findUploadById(Long id);
    List<Upload> findAllUploadsByGallery(Long galleryId);
    List<Upload> findAllUploadsByUser(Long userId);
    Upload createUpload(Upload upload);
    Upload updateUpload(Upload upload);
    void deleteUpload(Long id);
}
