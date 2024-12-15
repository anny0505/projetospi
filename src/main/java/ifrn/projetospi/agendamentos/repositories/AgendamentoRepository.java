package ifrn.projetospi.agendamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.projetospi.agendamentos.models.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
