package conferenceRegistration.repository;

import java.util.List;

import conferenceRegistration.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}