package My.Budget.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Budget {
   @Id
   @GeneratedValue
   private Long id;
   private Long income;
   private Long emergencyFunds;
   private Long savings;

   public Budget() {
   }

   public Long Id() {
      return this.id;
   }

   public Long Income() {
      return this.income;
   }

   public void Income(Long income) {
      this.income = income;
   }

   public Long EFunds() {
      return this.emergencyFunds;
   }

   public void EFunds(Long emergencyFunds) {
      this.emergencyFunds = emergencyFunds;
   }

   public Long mySavings() {
      return this.savings;
   }

   public void mySavings(Long savings) {
      this.savings = savings;
   }
}
