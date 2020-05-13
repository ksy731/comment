
package youtube_ksy;

public class DeletedVideo extends AbstractEvent {

    private String videoId;
    private Date uploadTime;
    private String clientID;
    private String channelId;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
    public String getClientId() {
        return clientID;
    }

    public void setClientId(String clientID) {
        this.clientID = clientID;
    }
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
