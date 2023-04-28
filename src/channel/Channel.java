package channel;

import chat.Chat;

import java.util.ArrayList;

public class Channel implements ChannelInterface {

    // Переменные экземпляра класса
    protected String name; // имя канала
    protected String channelDescription; // описание канала
    protected ArrayList<Chat<?>> chatsList; // список чатов в канале

    /**

     Конструктор класса Channel.
     @param name имя канала
     @param channelDescription описание канала
     */
    public Channel(String name, String channelDescription){
        this.name = name;
        this.channelDescription = channelDescription;
        this.chatsList = new ArrayList<>();
    }
    /**

     Возвращает имя канала.
     @return имя канала
     */
    public String getName() {
        return name;
    }
    /**

     Устанавливает имя канала.
     @param name имя канала
     */
    public void setName(String name) {
        this.name = name;
    }
    /**

     Возвращает описание канала.
     @return описание канала
     */
    public String getChannelDescription() {
        return channelDescription;
    }
    /**

     Устанавливает описание канала.
     @param channelDescription описание канала
     */
    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }
    /**

     Возвращает список чатов в канале.
     @return список чатов в канале
     */
    public ArrayList<Chat<?>> getChatsList() {
        return chatsList;
    }
    /**

     Добавляет чат в список чатов канала.
     @param chat чат для добавления
     */
    @Override
    public void addChat(Chat<?> chat) {
        this.chatsList.add(chat);
    }
    /**

     Удаляет чат из списка чатов канала.
     @param chat чат для удаления
     */
    @Override
    public void removeChat(Chat<?> chat) {
        this.chatsList.remove(chat);
    }
    /**

     Возвращает строковое представление объекта Channel.
     @return строковое представление объекта Channel
     */
    @Override
    public String toString(){
        return this.name + "\n" + this.channelDescription;
    }
}
