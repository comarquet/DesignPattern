package com.company;

import java.util.Map;

public abstract class AbstractUserFactory {

    public abstract AbstractUser createUser(Map<String, String> data);

}
