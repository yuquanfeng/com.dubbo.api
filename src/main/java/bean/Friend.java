package bean;

import java.io.Serializable;

public class Friend implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String friendName;
    private String friendSex;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendSex() {
        return friendSex;
    }

    public void setFriendSex(String friendSex) {
        this.friendSex = friendSex;
    }
}
