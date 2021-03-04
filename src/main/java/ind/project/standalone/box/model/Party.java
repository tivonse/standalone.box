package ind.project.standalone.box.model;

import ind.project.standalone.box.util.model.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Data@MappedSuperclass
public class Party extends AbstractEntity {

}


