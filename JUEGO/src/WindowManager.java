/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class WindowManager {
    
    private Login login;
    private Lobby lobby;
    private Mapa mapa;
    
    public WindowManager(){
        login = new Login(this);
        lobby = new Lobby(this);
        mapa = new Mapa();
        lobby.setVisible(true);
        login.setVisible(false);
        
    }
    
    public static void main(String[] args) {
        new WindowManager();
    }
}
