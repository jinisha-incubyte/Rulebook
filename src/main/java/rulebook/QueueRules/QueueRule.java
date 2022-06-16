package rulebook.QueueRules;

import com.deliveredtechnologies.rulebook.annotation.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRootPane;
import rulebook.Contract;

 @Rule(order=1)
//@Rule
public class QueueRule {
  String contractNo;

  @Given private List<Contract> contracts;
  // private  Contract contract;

  @Result private List<String> queueName = new ArrayList<>();

  @When
  public boolean when() {

    return contracts.stream().anyMatch(contract -> contract.isLegal() && !contract.isHas101());
    // return contract.isLegal() && !contract.isHas101();
  }


  @Then
  public void then() {
    // this.contractNo=
    queueName.add("Legal");
  }
}
