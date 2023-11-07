package at.technikum.repository;


import at.technikum.model.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository extends EntityRepository<Book> implements PanacheRepositoryBase<Book, Long> {

}
