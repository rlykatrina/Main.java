package chat;

import sticker.Sticker;

import java.util.ArrayList;

public class Chat<T extends Sticker> implements ChatInterface<T> {
    protected String name;
    protected int premiumStatus;
    protected int countPeople;
    protected int premiumCountPeople;
    protected int freeCountPeople;
    protected ArrayList<T> stickersList;

    /**

     Конструктор класса Chat.
     @param name имя чата.
     */
    public Chat(String name) {
        this.name = name;
        this.premiumStatus = 0;
        this.premiumCountPeople = 250;
        this.freeCountPeople = 50;
        this.countPeople = this.freeCountPeople;
        this.stickersList = new ArrayList<>();
    }
    /**

     Возвращает имя чата.
     @return имя чата.
     */
    public String getName() {
        return this.name;
    }
    /**

     Устанавливает имя чата.
     @param name имя чата.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**

     Возвращает максимальное количество участников в премиум-чате.
     @return максимальное количество участников в премиум-чате.
     */
    public int getPremiumCountPeople() {
        return this.premiumCountPeople;
    }
    /**

     Устанавливает максимальное количество участников в премиум-чате.
     @param premiumCountPeople максимальное количество участников в премиум-чате.
     */
    public void setPremiumCountPeople(int premiumCountPeople) {
        if (premiumCountPeople > this.freeCountPeople) {
            this.premiumCountPeople = premiumCountPeople;
        }
    }
    /**

     Возвращает максимальное количество участников в бесплатном чате.
     @return максимальное количество участников в бесплатном чате.
     */
    public int getFreeCountPeople() {
        return this.freeCountPeople;
    }
    /**

     Устанавливает максимальное количество участников в бесплатном чате.
     @param freeCountPeople максимальное количество участников в бесплатном чате.
     */
    public void setFreeCountPeople(int freeCountPeople) {
        if (freeCountPeople < this.premiumCountPeople) {
            this.freeCountPeople = freeCountPeople;
        }
    }
    /**

     Возвращает текущее количество участников в чате.
     @return текущее количество участников в чате.
     */
    public int getCountPeople() {
        return this.countPeople;
    }
    /**

     Возвращает статус премиума чата (0 - бесплатный, 1 - премиум).
     @return статус премиума чата.
     */
    public int getPremiumStatus() {
        return this.premiumStatus;
    }

    /**

     Устанавливает статус чата (0 - бесплатный, 1 - премиум).

     */
    public void setPremiumStatus(int premiumStatus) {
        if (premiumStatus == 1) {
            this.countPeople = this.premiumCountPeople;
        } else if (premiumStatus == 0) {
            this.countPeople = this.freeCountPeople;
        }
        this.premiumStatus = premiumStatus;
    }
    /**

     Возвращает список стикеров
     @return список стикеров.
     */
    public ArrayList<T> getStickersList() {
        return stickersList;
    }
    /**

     добавляет стикер
     */
    @Override
    public void addSticker(T sticker) {
        this.stickersList.add(sticker);
    }
    /**

     удаляет стикер
     */
    @Override
    public void removeSticker(T sticker) {
        this.stickersList.remove(sticker);
    }
    /**

     Возвращает общую стоимость стикеров
     @return стоимость стикеров.
     */
    @Override
    public int calculateStickersPrice() {
        int total = 0;
        if (this.stickersList.size() == 0) {
            return total;
        }
        for (var x : this.stickersList) {
            total += x.getPrice();
        }
        return total;
    }
    /**

     Возвращает количество стикеров
     @return количество стикеров.
     */
    @Override
    public int calculateCountStickers() {
        return this.stickersList.size();
    }
    /**

     Возвращает количество премиум стикеров
     @return количество премиум стикеров
     */
    @Override
    public int calculateCountPremiumStickers() {
        int total = 0;
        for (var x: this.stickersList){
            if (x.getPrice() != 0){
                total += 1;
            }
        }
        return total;
    }
    /**

     Возвращает количество бесплатных стикеров
     @return количество бесплатных стикеров
     */
    @Override
    public int calculateCountFreeStickers() {
        return this.calculateCountStickers() - this.calculateCountPremiumStickers();
    }
    /**

     Возвращает строковое представление объекта Chat.
     @return строковое представление объекта Chat
     */
    @Override
    public String toString() {
        return switch (this.premiumStatus){
            case 1 -> "Premium chat";
            default -> "Default chat";
        };
    }
}
