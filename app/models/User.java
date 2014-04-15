package models;

import play.data.validation.Password;
import play.db.jpa.Model;

/**
 * Created by Kruk on 12.04.2014.
 */
public class User extends Model {
    String username;
    @Password
    String password;
}
