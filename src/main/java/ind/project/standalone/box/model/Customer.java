package ind.project.standalone.box.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Party {

    private String name;

    @OneToOne
    @JoinColumn(name = "portal_profile_id", referencedColumnName = "id")
    private PortalProfile portalProfile;

}
