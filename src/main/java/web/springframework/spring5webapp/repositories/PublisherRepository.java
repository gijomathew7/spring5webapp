package web.springframework.spring5webapp.repositories;


import org.springframework.data.repository.CrudRepository;
import web.springframework.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}