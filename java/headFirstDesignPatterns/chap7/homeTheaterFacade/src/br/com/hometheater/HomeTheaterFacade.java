package br.com.hometheater;

import br.com.hometheater.subsystems.Amplifier;
import br.com.hometheater.subsystems.CdPlayer;
import br.com.hometheater.subsystems.DvdPlayer;
import br.com.hometheater.subsystems.PopcornMachine;
import br.com.hometheater.subsystems.Screen;

public class HomeTheaterFacade {
    Amplifier amp;
    CdPlayer cd;
    DvdPlayer dvd;
    PopcornMachine popm;
    Screen scr;
    
    public HomeTheaterFacade(Amplifier amp, CdPlayer cd, DvdPlayer dvd,
            PopcornMachine popm, Screen scr) {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.popm = popm;
        this.scr = scr;
    }
    
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        
        this.amp.on();
        this.popm.on();
        this.scr.up();
        this.dvd.on();
        System.out.println("movie: "+movie);
        this.popm.off();
    }
    
    public void endMovie(){
        this.dvd.off();
        this.scr.down();
        this.amp.off();
    }
    
    public void startCd(){
        this.cd.on();
        this.scr.up();
    }
    
    public void stopCd(){
        this.scr.down();
        this.cd.off();
    }
}
