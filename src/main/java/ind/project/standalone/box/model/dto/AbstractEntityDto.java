package ind.project.standalone.box.model.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class AbstractEntityDto {
    private UUID id;
    private Date createdTime;
    private String createdBy;
    private Date updatedTime;
    private String updatedBy;
}
