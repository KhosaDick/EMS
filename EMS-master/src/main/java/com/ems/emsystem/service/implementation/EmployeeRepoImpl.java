package com.ems.emsystem.service.implementation;

import com.ems.emsystem.entity.Employee;
import com.ems.emsystem.repository.EmployeeRepo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class EmployeeRepoImpl implements EmployeeRepo {
    /**
     *
     */
    @Override
    public void flush() {
        
    }

    /**
     * @param entity
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> S saveAndFlush(S entity) {
        return null;
    }

    /**
     * @param entities
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    /**
     * @param entities
     */
    @Override
    public void deleteAllInBatch(Iterable<Employee> entities) {

    }

    /**
     * @param longs
     */
    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    /**
     *
     */
    @Override
    public void deleteAllInBatch() {

    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public Employee getOne(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @deprecated
     */
    @Override
    public Employee getById(Long aLong) {
        return null;
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public Employee getReferenceById(Long aLong) {
        return null;
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> List<S> findAll(Example<S> example) {
        return null;
    }

    /**
     * @param example
     * @param sort
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    /**
     * @param example
     * @param pageable
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> long count(Example<S> example) {
        return 0;
    }

    /**
     * @param example
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> boolean exists(Example<S> example) {
        return false;
    }

    /**
     * @param example
     * @param queryFunction
     * @param <S>
     * @param <R>
     * @return
     */
    @Override
    public <S extends Employee, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    /**
     * @param entity
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> S save(S entity) {
        return null;
    }

    /**
     * @param entities
     * @param <S>
     * @return
     */
    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public Optional<Employee> findById(Long aLong) {
        return Optional.empty();
    }

    /**
     * @param aLong
     * @return
     */
    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> findAll() {
        return null;
    }

    /**
     * @param longs
     * @return
     */
    @Override
    public List<Employee> findAllById(Iterable<Long> longs) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public long count() {
        return 0;
    }

    /**
     * @param aLong
     */
    @Override
    public void deleteById(Long aLong) {

    }

    /**
     * @param entity
     */
    @Override
    public void delete(Employee entity) {

    }

    /**
     * @param longs
     */
    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    /**
     * @param entities
     */
    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {

    }

    /**
     *
     */
    @Override
    public void deleteAll() {

    }

    /**
     * @param sort
     * @return
     */
    @Override
    public List<Employee> findAll(Sort sort) {
        return null;
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return null;
    }
}
