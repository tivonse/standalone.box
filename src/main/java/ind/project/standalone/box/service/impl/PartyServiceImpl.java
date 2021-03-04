package ind.project.standalone.box.service.impl;

import ind.project.standalone.box.repository.PartyRepository;
import ind.project.standalone.box.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyServiceImpl implements PartyService {

    private PartyRepository partyRepository;

    @Autowired
    PartyServiceImpl(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }


}
