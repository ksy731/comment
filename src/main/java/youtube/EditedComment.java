package youtube;

public class EditedComment extends AbstractEvent {

    private Long commentId;
    private String contents;

    public EditedComment(){
        super();
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
