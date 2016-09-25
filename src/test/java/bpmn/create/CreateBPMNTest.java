package bpmn.create;

import org.testng.annotations.Test;

public class CreateBPMNTest {

  @Test
  public void createsimpleBPMN() {
    
	  CreateBPMN bpmn = new CreateBPMN();
	  
	  System.out.println(bpmn.createsimpleBPMN());
	  
	  
  }
}
