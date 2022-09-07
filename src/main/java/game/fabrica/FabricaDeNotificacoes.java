package game.fabrica;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {
    String filePath;
    public FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) throws SlickException {        
        Image img = null;
        if(tipo.equalsIgnoreCase("gameover")){
            img = new Image(filePath + "\\src\\main\\java\\gameover.png");
        }
        else if (tipo.equalsIgnoreCase("ganhouJogo")){
            img = new Image(filePath + "\\src\\main\\java\\ganhou.png");
        }
        
        return img;
    }

   

}