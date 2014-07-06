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
    
     Login login;
     Lobby lobby;
     Mapa mapa;
     NewJFrame minijuego;
     
    
    public WindowManager(){
        login = new Login(this);
        lobby = new Lobby(this);
        mapa = new Mapa(this);
        minijuego = new NewJFrame(this);
        lobby.setVisible(true);
        lobby.setLocationRelativeTo(null);
        login.setVisible(false);
        mapa.setVisible(false);
        minijuego.setVisible(false);
    }
    
    public static void main(String[] args) {
        new WindowManager();
    }
}
