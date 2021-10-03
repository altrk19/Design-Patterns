package com.strategy;

public class Context {
    private Communicate communicate;

    public void setCommunicate(Communicate communicate) {
        this.communicate = communicate;
    }

    public void sendMessage(){
        communicate.send();
    }
}
