package rulebook;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;

public class ContractService {



  public static void main(String[] args) {
    RuleBookRunner ruleBook = new RuleBookRunner("rulebook");
    NameValueReferableMap<Contract> facts = new FactMap<>();
    Contract contract1 = new Contract();
    contract1.setContractNo("123");
    contract1.setHas101(true);
    contract1.setIsLegal(false);
    contract1.setExceptionComment("Exception1");

    Contract contract2 = new Contract();
    contract2.setContractNo("456");
    contract2.setHas101(false);
    contract2.setIsLegal(true);
    contract2.setExceptionComment("Exception1");

   facts.put(new Fact<>(contract1));
    facts.put(new Fact<>(contract2));

    ruleBook.run(facts);
    ruleBook.getResult().ifPresent(result -> System.out.println("Queue of contract is " + result+" queue"));
  }
}
