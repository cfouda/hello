package hello;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Database {

    private static List<User> users = new ArrayList<User>();

    public User addUser(User user) {
        user.setId(users.size());
        users.add(users.size(), user);
        return user;
    }

    public User editUser(User user) {
        if (user.getId() != 0) {
            users.add(user.getId(), user);
        }

        return user;
    }

    public void deleteUser(int id) {
        users.remove(id);
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public List<User> getAllUsers() {
        return users;
    }


}
