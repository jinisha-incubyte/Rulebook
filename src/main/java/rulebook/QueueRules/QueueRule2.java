package rulebook.QueueRules;

import com.deliveredtechnologies.rulebook.annotation.*;

import java.util.ArrayList;
import java.util.List;
import rulebook.Contract;

// @Rule(order=2)
@Rule
public class QueueRule2 {
  String contractNo;

  @Given private List<Contract> contracts;
  // private  Contract contract;

  @Result private List<String> queueName = new ArrayList<>();

  @When
  public boolean when() {

    return contracts.stream().anyMatch(contract -> contract.getExceptionComment() != null);
    // return contract.isLegal() && !contract.isHas101();
  }

  @Then
  public void then() {
    // this.contractNo=
    //    queueName=queueName+"Exception ";
    queueName.add("Exception");
  }
}
