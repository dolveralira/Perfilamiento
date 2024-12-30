package com.cibanco.cinet.models.entity;


import jakarta.persistence.*;
        import lombok.Data;
import org.springframework.context.annotation.Profile;

@Entity
@Table(name = "um_rel_profile_priv")
@Data
public class ProfilePrivilegeRelationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "um_profile_oid")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "um_privilege_oid")
    private PrivilegeEntity privilege;
}
