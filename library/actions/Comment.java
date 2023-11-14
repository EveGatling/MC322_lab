package library.actions;

public class Comment {
    private int memberId;
    private int mediaId;
    private String comment;

    public int getMemberId() {
        return this.memberId;
    }

    public int getMediaId() {
        return this.mediaId;
    }

    public String getComment() {
        return this.comment;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}