package WzorceStrukturalne.Pelnomocnik;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib{
    private ThirdPartyYouTubeLib youTubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy(){
        this.youTubeService = new ThirdPartyYouTubeClass();
    }
    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty()){
            cachePopular = youTubeService.popularVideos();
        }else
            System.out.println("Retrievied list from cache.");

    return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if(video == null){
            video = youTubeService.getVideo(videoId);
            cacheAll.put(videoId,video);
        }else
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        return video;

    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
