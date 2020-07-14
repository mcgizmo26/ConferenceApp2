import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import conferenceRegistration.repository.HibernateSpeakerRepositoryImpl;
import conferenceRegistration.repository.SpeakerRepository;
import conferenceRegistration.service.SpeakerService;
import conferenceRegistration.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"conferenceRegistration"})
public class AppConfig {

	// Spring injects the SpeakerRepository bean into the speakerService bean and
	// return it back to the application when we call it
//	@Bean(name = "speakerService")
//	public SpeakerService getSpeakerService() {
////		SpeakerServiceImpl service = new SpeakerServiceImpl();
//		SpeakerServiceImpl service = new SpeakerServiceImpl();
////		service.setRepository(getSpeakerRepository());
//		return service;
//	}

	// Beans allow us to create singleton objects by calling them only on the 1st
	// call.
//	@Bean(name = "SpeakerRepository")
//	public SpeakerRepository getSpeakerRepository() {
//		return new HibernateSpeakerRepositoryImpl();
//	}
}
