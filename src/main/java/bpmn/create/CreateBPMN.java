package bpmn.create;


import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;

public class CreateBPMN {
	
	public CreateBPMN(){
		
	}
	
	public String createsimpleBPMN(){
		//This model is not executable :(
		BpmnModelInstance model = Bpmn.createExecutableProcess("ExampleGeneratedProcess")
				.startEvent()
				.scriptTask("GeneratedScriptTask").scriptFormat("Groovy").scriptText("println(\"Hello\")")
				.endEvent()
				.done();
		
		String xml = Bpmn.convertToString(model);
		
		return xml;
	}
	
	
	public boolean startProcess(){
		
		return true;
	}
	
}
