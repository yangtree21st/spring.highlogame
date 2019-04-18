package com.zipcodewilmington.springutils;

import org.springframework.data.repository.CrudRepository;

abstract public class AbstractService<EntityType, IdType> implements ServiceInterface<EntityType, IdType> {
    protected CrudRepository<EntityType, IdType> repository;

    public AbstractService(CrudRepository<EntityType, IdType> repository) {
        this.repository = repository;
    }

    @Override
    public EntityType create(EntityType entity) {
        return repository.save(entity);
    }

    @Override
    public EntityType read(IdType id) {
        return repository.findById(id).get();
    }

    @Override
    public EntityType delete(IdType id) {
        EntityType entity = repository.findById(id).get();
        repository.delete(entity);
        return entity;
    }

    @Override
    abstract public EntityType update(IdType gameId, EntityType newHighLowGame);
}
