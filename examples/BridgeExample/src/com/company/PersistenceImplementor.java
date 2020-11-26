package com.company;

/**
 * Implementor Interface
 */
public interface PersistenceImplementor {

    public long saveObject(Object object);

    public void deleteObject(long objectId);

    public Object getObject(long objectId);


}
