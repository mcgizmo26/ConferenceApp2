package conferenceRegistration.repository;

import java.util.ArrayList;
import java.util.List;

import conferenceRegistration.model.Speaker;
import org.springframework.stereotype.Repository;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	public List<Speaker> findAll() {
		List<Speaker> speakers = new ArrayList<Speaker>();

		Speaker speaker = new Speaker();

		speaker.setFirstName("Lonnie");
		speaker.setLastName("McGill");

		speakers.add(speaker);

		return speakers;
	}

}
