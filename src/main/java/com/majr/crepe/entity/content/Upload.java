package com.majr.crepe.entity.content;

import com.majr.crepe.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Upload {

    private Long id;

    private User user;

    private Category category;

    private Gallery gallery;

    private String title;

    private String description;

    private LocalDateTime dateUploaded;

    private LocalDateTime dateUpdated;
}
