package youtube_ksy;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="CommentService_table")
public class CommentService {

    private Long commentId;
    private Long channelId;
    private Long clientId;
    private Long videoId;
    private String contents;

    @PrePersist
    public void onPrePersist(){
        CreatedComment createdComment = new CreatedComment();
        BeanUtils.copyProperties(this, createdComment);
        createdComment.publishAfterCommit();


        EditedComment editedComment = new EditedComment();
        BeanUtils.copyProperties(this, editedComment);
        editedComment.publishAfterCommit();


        DeletedComment deletedComment = new DeletedComment();
        BeanUtils.copyProperties(this, deletedComment);
        deletedComment.publishAfterCommit();


    }


    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }




}
