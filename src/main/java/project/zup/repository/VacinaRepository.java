package project.zup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.zup.domain.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
