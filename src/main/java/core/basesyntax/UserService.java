package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (int i = 0; i < records.length; i++) {
            String[] yourVariable = records[i].split(":");
            if (email.equals(yourVariable[0])) {
                return Integer.parseInt(yourVariable[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
