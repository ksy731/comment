package youtube_ksy;

public class DeletedComment extends AbstractEvent {

    private Long commentId;

    public DeletedComment(){
        super();
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
}
