package My.Budget.demo;

import org.springframework.data.jpa.repository.JpaRepository;




public interface BudgetRepo extends JpaRepository<Budget, Long> {
}


