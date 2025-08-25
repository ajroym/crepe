package com.majr.crepe.entity.commission;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reference {

    private Long id;

    private Commission commission;

    private String imageUri;
}
