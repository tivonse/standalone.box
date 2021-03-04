package ind.project.standalone.box.model.dto;

import ind.project.standalone.box.model.Customer;
import lombok.Data;

@Data
public class PortalProfileDto {
    private String username;
    private String password;
    private String email;
    private Boolean promotionOptIn;
    private Customer customer;
}
