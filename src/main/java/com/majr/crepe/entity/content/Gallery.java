package com.majr.crepe.entity.content;

import com.majr.crepe.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gallery {

    private Long id;

    private User user;

    private String title;
}
