package com.majr.crepe.entity.commission;

import com.majr.crepe.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Commission {

    private Long id;

    private User artistId;

    private User commissionerId;

    private String description;

    private Double quotedPrice;

    private boolean isCompleted;
}
