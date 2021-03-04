package ind.project.standalone.box.repository;

import ind.project.standalone.box.model.PortalProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PortalProfileRepository extends JpaRepository<PortalProfile, UUID> {
}
