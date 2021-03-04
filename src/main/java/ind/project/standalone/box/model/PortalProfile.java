package ind.project.standalone.box.model;

import ind.project.standalone.box.util.model.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "portalProfiles")
@AllArgsConstructor
@NoArgsConstructor
public class PortalProfile extends AbstractEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "promotion_opt_in")
    private Boolean promotionOptIn;

    @OneToOne(mappedBy = "portalProfile")
    private Customer customer;
}
