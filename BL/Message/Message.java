/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Message;

import User.*;

/**
 *
 * @author HP
 */
public class Message {
    public Users Sender,Receiver;
    public String Text;
    
    public Message(User.Users Sender, User.Users Receiver, String Text) {
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Text = Text;
    }
}
