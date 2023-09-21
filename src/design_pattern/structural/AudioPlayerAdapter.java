package design_pattern.structural;


interface AdvanceMediaPlayer{
    void playMp3(String filename);
    void playWav(String filename);
}

class PlayMp3{
    public void playMp3File(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}

class PlayWav{
    void playWavFile(String filename) {
        System.out.println("Playing WAV file: " + filename);
    }
}

class MediaAdapter implements AdvanceMediaPlayer{

    PlayMp3 playMp3;
    PlayWav playWav;

   public MediaAdapter(){
        this.playMp3= new PlayMp3();
        this.playWav= new PlayWav();
    }

    @Override
    public void playMp3(String filename) {
          playMp3.playMp3File(filename);
    }

    @Override
    public void playWav(String filename) {
        playWav.playWavFile(filename);
    }
}



public class AudioPlayerAdapter {

    AdvanceMediaPlayer advanceMediaPlayer;

    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("Mp3")){
            advanceMediaPlayer= new MediaAdapter();
            advanceMediaPlayer.playMp3(filename);
        }else if (audioType.equalsIgnoreCase("wav")) {
            advanceMediaPlayer = new MediaAdapter();
            advanceMediaPlayer.playWav(filename);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}


 class AudioPlayerAdapter_Main{
    public static void main(String[] args) {
        AudioPlayerAdapter audioPlayerAdapter = new AudioPlayerAdapter();
        audioPlayerAdapter.play("Mp3","song.mp3");
        audioPlayerAdapter.play("wav", "music.wav");
        audioPlayerAdapter.play("mp4", "video.mp4"); // Invalid media type
    }
}
