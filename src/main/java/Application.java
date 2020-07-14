import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import conferenceRegistration.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
