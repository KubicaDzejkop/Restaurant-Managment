package pl.gornik.autentykacja;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Authenticator {
    private List<User> users;

    public Authenticator() {
        this.users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public User login(String login, String password) throws LoginException {
        for (User user : users) {
            if (user.getCredentials().getLogin().equals(login) && user.getCredentials().getPassword().equals(password)) {
                return user;
            }
        }
        throw new LoginException("Niepoprawny login lub hasło.");
    }
}
