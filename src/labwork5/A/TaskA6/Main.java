package labwork5.A.TaskA6;

public class Main {
    public static void main(String[] args) {
        Video videoBirthday = new Video("Birthday",24);
        Video videoAnniversary = new Video("Anniversary",30);
        Video videoClip = new Video("Clip",5);
        VideoPlayer videoPlayer = new VideoPlayer("PotPlayer","PotPlayer1",2010,
                videoClip,videoAnniversary,videoBirthday);

        videoPlayer.play();
        videoPlayer.shuffle();
        videoPlayer.play();
        videoPlayer.show();
        videoPlayer.display();
    }
}
