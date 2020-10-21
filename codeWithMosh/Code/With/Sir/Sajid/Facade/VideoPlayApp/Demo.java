package Code.With.Sir.Sajid.Facade.VideoPlayApp;

import java.io.File;

public class Demo {
    public static void main(String[] args){
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubeVideo.ogg", "mp4");

    }
}
