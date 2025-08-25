package com.majr.crepe.entity.commission;

import com.majr.crepe.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "commission")
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "artist_user_id")
    private User artistId;

    @ManyToOne
    @JoinColumn(name = "commissioner_user_id")
    private User commissionerId;

    @ManyToOne
    @JoinColumn(name = "commission_status_id")
    private CommissionStatus commissionStatus;

    @Column(name = "description")
    private String description;

    @Column(name = "quoted_price")
    private Double quotedPrice;

    @Column(name = "is_completed")
    private boolean isCompleted;
}
