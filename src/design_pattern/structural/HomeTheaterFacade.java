package design_pattern.structural;

//The Facade design pattern is a structural pattern that provides a simplified interface to a complex
// system or set of interfaces.
// It hides the complexities of the underlying system and provides a single unified interface to the client code.
// This simplifies client code by reducing the dependencies on multiple subsystems and makes the code more maintainable.


//single class that represents entire sub-system
class DVDPlayer {
    void on() {
        System.out.println("DVD Player is on");
    }

    void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    void off() {
        System.out.println("DVD Player is off");
    }
}

class Projector {
    void on() {
        System.out.println("Projector is on");
    }

    void wideScreenMode() {
        System.out.println("Projector is in widescreen mode");
    }

    void off() {
        System.out.println("Projector is off");
    }
}

class Screen {
    void up() {
        System.out.println("Screen is up");
    }

    void down() {
        System.out.println("Screen is down");
    }
}

class SoundSystem {
    void on() {
        System.out.println("Sound System is on");
    }

    void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
    }

    void off() {
        System.out.println("Sound System is off");
    }
}

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.screen = new Screen();
        this.soundSystem = new SoundSystem();
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvdPlayer.on();
        dvdPlayer.play(movie);
        soundSystem.on();
        soundSystem.setVolume(10);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("The Matrix");
        System.out.println("Enjoying the movie...");
        homeTheater.soundSystem.setVolume(5);
        homeTheater.endMovie();
    }
}
