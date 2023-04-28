package channel;

import chat.Chat;

public interface ChannelInterface {
    void addChat(Chat<?> chat);
    void removeChat(Chat<?> chat);
}
