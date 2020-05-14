package youtube;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import java.util.List;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

@Entity
@Table(name="CommentService_table")
public class CommentService {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long commentId;
    private Long channelId;
    private Long clientId;
    private Long videoId;
    private String contents;

    private int commentCount = 0; // 댓글수

    @PrePersist
    public void onPrePersist(){
        CreatedComment createdComment = new CreatedComment();
        BeanUtils.copyProperties(this, createdComment);
        createdComment.publishAfterCommit();

        System.out.println(("********* CreatedComment OK **********"));
    }

    @PreUpdate
    public void onPostEdited(){
        EditedComment editedComment = new EditedComment();
        BeanUtils.copyProperties(this, editedComment);
        editedComment.publishAfterCommit();

        System.out.println(("********* EditedComment OK **********"));
    }

    @PreRemove
    public void onPostRemove(){
        DeletedComment deletedComment = new DeletedComment();
        BeanUtils.copyProperties(this, deletedComment);
        deletedComment.publishAfterCommit();

        System.out.println(("********* DeletedComment OK **********"));
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

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void addTotalView(int commentCount) {
        this.commentCount += commentCount;
    }

}
