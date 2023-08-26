public class Video {
    String videoId;
    String title;
    long views;
    int likes;
    static int totalVideos;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public static int getTotalVideos() {
        return totalVideos;
    }

    public static void setTotalVideos(int totalVideos) {
        Video.totalVideos = totalVideos;
    }
}
