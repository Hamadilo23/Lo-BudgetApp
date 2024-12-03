package My.Budget.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class controller {
    @Autowired
    private BudgetRepo budgetRepo;

    @GetMapping
    public List<Budget> getBudegts() {
        return budgetRepo.findAll();
    }

    @GetMapping
    public ResponseEntity<Budget>getBudgtByID(@PathVariable Long id) {
        Optional<Budget> budget = budgetRepo.findById(id);
        if (budget.isPresent()) {
            return ResponseEntity.ok(budget.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public Budget myGenBudgets(@RequestBody Budget budget) {
        return budgetRepo.save(budget);
    }


    @PostMapping
    public ResponseEntity<Budget> New_Budgte(@PathVariable Long id, @RequestBody Budget budget_available) {
        Optional<Budget> budget = budgetRepo.findById(id);
        if (budget.isPresent()) {
            Budget NowBudget = budget.get();
            NowBudget.Income(budget_available.Income());
            NowBudget.EFunds(budget_available.EFunds());
            NowBudget.mySavings(budget_available.mySavings());
            Budget New_Budgte= budgetRepo.save(NowBudget);
            return ResponseEntity.ok(New_Budgte);
        } else{
            return ResponseEntity.notFound().build();
        }
        
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteBug(@PathVariable Long id) {
        Optional<Budget> budget = budgetRepo.findById(id);
        if (budget.isPresent()) {
            budgetRepo.delete(budget.get());
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    
}
