import hello.User
import hello.UserService
import spock.lang.Specification

class UserTest extends Specification {

    def UserService service;

    def "Checking  that a User object is added to database"() {
        given:
        service = new UserService();
        User chris=new User("Chris",26,"London");
        service.addUser(chris);
        expect:
        service.getAllUsers().size() == 1
        service.getUser(0) == chris;
    }
}
