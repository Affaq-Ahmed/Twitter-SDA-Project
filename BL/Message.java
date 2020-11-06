
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Message {
    String RUsername,SUsername,Text;
    

    public Message(String RUsername, String SUsername, String Text) {
        this.RUsername = RUsername;
        this.SUsername = SUsername;
        this.Text = Text;
    }
    
    public int Dm(){
        int Dm = TwitterDB.Dm(this.SUsername, this.RUsername, this.Text);
        return Dm;
    }
    
}
