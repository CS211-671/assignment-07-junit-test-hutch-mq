package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.String;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("a1", "1");
        users.addUser("b1", "2");
        users.addUser("c1", "3");

        // TODO: find one of them
        User user = users.findUserByUsername("a1");

        // TODO: assert that UserList found User
        //String expected = "<one of username>";

        String expected = "a1";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("a1", "1");
        users.addUser("b1", "2");
        users.addUser("c1", "3");

        // TODO: change password of one user
        //User user = user.validatePassword("1");

        // TODO: assert that user can change password
        String actual = user.getPassword();
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("a1", "1");
        users.addUser("b1", "2");
        users.addUser("c1", "3");

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList users = new UserList();
        users.addUser("a1", "1");
        users.addUser("b1", "2");
        users.addUser("c1", "3");

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}