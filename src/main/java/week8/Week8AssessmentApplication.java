package week8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import week8.beans.Animal;
import week8.controller.BeanConfiguration;
import week8.repository.AnimalRepository;

@SpringBootApplication
public class Week8AssessmentApplication implements CommandLineRunner {

	@Autowired
	AnimalRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentApplication.class, args);
	}

	public void run(String... args) throws Exception {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Animal a = appContext.getBean("animal", Animal.class);

		repo.save(a);

		Animal b = new Animal("Todd", "Giraffe", 4);

		repo.save(b);

		Animal c = new Animal("Greg", "Penguin", 2);

		repo.save(c);

		List<Animal> allAnimals = repo.findAll();

		for (Animal animals : allAnimals) {
			System.out.println(animals.toString());
		}

		((AbstractApplicationContext) appContext).close();
	}

}
