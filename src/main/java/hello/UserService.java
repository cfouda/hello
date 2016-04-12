package hello;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserService {

    private Database database = new Database();

    @RequestMapping(path = "/users/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable("userId") int id) {
        return database.getUser(id);
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return database.getAllUsers();
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        return database.addUser(user);
    }

    @RequestMapping(path = "/users/{userId}", method = RequestMethod.DELETE)
    public void removeUser(@PathVariable("userId") int id) {
        database.deleteUser(id);
    }
}
