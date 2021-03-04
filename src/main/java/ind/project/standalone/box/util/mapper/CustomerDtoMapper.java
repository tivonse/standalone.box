package ind.project.standalone.box.util.mapper;

import ind.project.standalone.box.model.Customer;
import ind.project.standalone.box.model.PortalProfile;
import ind.project.standalone.box.model.dto.CustomerDto;
import ind.project.standalone.box.model.dto.PortalProfileDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDtoMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);

    PortalProfileDto portalProfileToPortalProfileDto(PortalProfile portalProfile);

    PortalProfile portalProfileDtoToPortalProfile(PortalProfileDto portalProfileDto);

}
