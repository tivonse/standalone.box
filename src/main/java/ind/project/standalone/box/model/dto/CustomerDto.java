package ind.project.standalone.box.model.dto;

import ind.project.standalone.box.model.Customer;
import ind.project.standalone.box.model.PortalProfile;
import lombok.Data;

@Data
public class CustomerDto {
    private String name;
    private PortalProfile portalProfile;
}
