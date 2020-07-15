import conferenceRegistration.util.CalandarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"conferenceRegistration"})
public class AppConfig {

    @Bean(name= "cal")
    public CalandarFactory calFactory(){
        CalandarFactory factory = new CalandarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

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
