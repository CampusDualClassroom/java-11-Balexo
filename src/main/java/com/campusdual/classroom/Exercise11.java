package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        System.out.println(redRemote.turnOn());
        redRemote.channelUp();
        redRemote.channelDown();
        redRemote.setChannel(0);
        redRemote.channelDown();
        redRemote.volumeUp();
        redRemote.volumeDown();
        redRemote.setVolume(0);
        redRemote.volumeDown();
        redRemote.getColor();
        redRemote.turnOff();
    }

}