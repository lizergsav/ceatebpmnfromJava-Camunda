package bpmn.camundaboot;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.spring.boot.starter.SpringBootProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ProcessApplication

public class RunCamundaWebapp extends SpringBootProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunCamundaWebapp.class);

	}

}
