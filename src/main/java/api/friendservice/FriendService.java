package api.friendservice;

import bean.Friend;
import bean.NFResult;

public interface FriendService {
    NFResult<Friend> selectFriend(String friendName);
}
