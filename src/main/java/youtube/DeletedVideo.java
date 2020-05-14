
package youtube;

import java.util.Date;

public class DeletedVideo extends AbstractEvent {

    private Long videoId;
    private Date uploadTime;
    private Long clientID;
    private Long channelId;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
    public Long getClientId() {
        return clientID;
    }

    public void setClientId(Long clientID) {
        this.clientID = clientID;
    }
    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }
}
