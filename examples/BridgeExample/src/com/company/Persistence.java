package com.company;

/**
 * Persistence Interface
 * Abstraction Interface
 */
public interface Persistence {

    /**
     * @param object
     * @return returns objectID
     */
    public String persist(Object object);

    /**
     * @param objectId
     * @return persisted Object
     */
    public Object findById(String objectId);

    /**
     * @param id
     */
    public void deleteById(String id);


}

public abstract class MessageSenderBase
{
    public abstract void SendMessage(String title, String details, int importance);
}
