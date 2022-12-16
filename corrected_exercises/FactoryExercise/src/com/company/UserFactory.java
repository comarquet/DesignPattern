package com.company;

import java.util.Map;

public class UserFactory extends AbstractUserFactory {

    @Override
    public AbstractUser createUser(Map<String, String> data) {
        if (data.containsKey("adminRights")) {
            return new AdminUser(data.get("email"), data.get("name"), data.get("adminRights"));
        } else if (data.containsKey("creditCardInfo")) {
            return new CustomerUser(data.get("email"), data.get("name"), data.get("creditCardInfo"));
        } else {
            return null;
        }
    }

}
