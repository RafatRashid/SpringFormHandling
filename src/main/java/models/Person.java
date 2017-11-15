package models;

import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by RAFATxRASHID on 14-Nov-17.
 */
public class Person
{
    @NotNull
    int id;

    @NotNull
    @Size(min = 3, max = 25, message = "dude 3<-->25 man come onnn")
    String name;

    @NotNull
    @Email
    String email;

    @NotNull
    @Size(min = 3, max=8)
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: "+this.getId()+";Name: "+this
                .getName()+"; Email: "+this.getEmail()+"; Password: "+this.getPassword()+";";
    }
}
