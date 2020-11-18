package ge.edu.btu.chat;

import java.io.Serializable;

public class TextToSend implements Serializable {
    private String text;

    public TextToSend() {

    }

    public TextToSend(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
