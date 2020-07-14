package conferenceRegistration.service;

import java.util.List;

import conferenceRegistration.model.Speaker;
import conferenceRegistration.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository;

	public SpeakerServiceImpl(){
		System.out.println("SpeakerServiceImpl no args constructor");
	}

	public SpeakerServiceImpl(SpeakerRepository speakerRepository){
		System.out.println("SpeakerServiceImpl repository constructor");
		repository = speakerRepository;
	}

	@Autowired
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl setter");
		this.repository = repository;
	}

	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}

}
