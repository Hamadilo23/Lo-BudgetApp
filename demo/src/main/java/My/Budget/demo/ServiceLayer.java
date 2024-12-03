package My.Budget.demo;

import java.io.PrintStream;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
   public ServiceLayer() {
   }

   public void my_Budget(Budget budgets) {
      PrintStream var10000 = System.out;
      String var10001 = String.valueOf(budgets.Income());
      var10000.println("What I have saved: Income: " + var10001 + ", Emergency Funds: " + String.valueOf(budgets.EFunds()) + ", Savings: " + String.valueOf(budgets.mySavings()));
   }
}
