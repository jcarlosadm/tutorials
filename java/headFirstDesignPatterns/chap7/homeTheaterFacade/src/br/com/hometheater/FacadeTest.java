package br.com.hometheater;

import br.com.hometheater.subsystems.Amplifier;
import br.com.hometheater.subsystems.CdPlayer;
import br.com.hometheater.subsystems.DvdPlayer;
import br.com.hometheater.subsystems.PopcornMachine;
import br.com.hometheater.subsystems.Screen;

public class FacadeTest {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        CdPlayer cd = new CdPlayer();
        DvdPlayer dvd = new DvdPlayer();
        PopcornMachine popm = new PopcornMachine();
        Screen scr = new Screen();
        
        HomeTheaterFacade htc = new HomeTheaterFacade(amp, cd, dvd, popm, scr);
        
        System.out.println("Movie:");
        htc.watchMovie("Matrix");
        System.out.println("\nStop movie");
        htc.endMovie();
        
        System.out.println("\nCd:");
        htc.startCd();
        System.out.println("\nStop cd");
        htc.stopCd();
    }
}
