package at.technikum.repository;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.inject.Inject;

public class EntityRepository<T> {

    @Inject
    EntityManager entityManager;

    public T mergeAndFlush(T student) {
        T merged = entityManager.merge(student);
        entityManager.flush();
        return merged;
    }
}