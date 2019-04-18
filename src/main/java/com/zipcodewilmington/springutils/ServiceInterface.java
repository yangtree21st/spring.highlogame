package com.zipcodewilmington.springutils;

public interface ServiceInterface<EntityType, IdType> {
    EntityType create(EntityType highLowGame);

    EntityType read(IdType gameId);

    EntityType update(IdType gameId, EntityType newHighLowGame);

    EntityType delete(IdType gameId);
}
