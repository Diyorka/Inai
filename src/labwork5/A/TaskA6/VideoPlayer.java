package labwork5.A.TaskA6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VideoPlayer extends Player{
    private List<Video> videoList = new ArrayList<>();


    public VideoPlayer(String name, String mark, int productionYear,List<Video> videoList){
        super(name,mark,productionYear);
        this.videoList = videoList;
    }

    public VideoPlayer(String name, String mark, int productionYear,Video... args){
        super(name,mark,productionYear);
        this.videoList.addAll(Arrays.stream(args).toList());
    }

    public void play(){
        System.out.println("Playing " + videoList.get(0).getName());
    }

    public void shuffle(){
        Collections.shuffle(videoList);
    }

    public void show(){
        System.out.println("Information about videos: \n");
        for (int i = 0; i < videoList.size(); i++) {
            System.out.println(videoList.get(i).toString());
        }
        System.out.println("\n");
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }


}
