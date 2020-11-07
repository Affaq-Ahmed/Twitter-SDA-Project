/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author HP
 */
public class UsersD extends Users {
    public String Password;
    
    public UsersD(String Password, String Username, String Name) {
        super(Username, Name);
        this.Password = Password;
    }
}
