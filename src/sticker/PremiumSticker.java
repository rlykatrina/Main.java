package sticker;

public class PremiumSticker extends Sticker {

    /**

     Конструктор класса PremiumSticker.
     @param name имя стикера
     @param message сообщение стикера
     @param price стоимость стикера
     */
    public PremiumSticker(String name, String message, int price) {
        super(name, message);
        this.price = price;
    }
    /**

     Устанавливает новую стоимость стикера.
     @param price новая стоимость стикера
     */
    public void setPrice(int price) {
        if (price != 0) {
            this.price = price;
        }
    }
    /**

     Выводит статус стикера (бесплатный или нет).
     */
    @Override
    public void stickerStatus() {
        System.out.println("This sticker is premium");
    }
    /**

     Возвращает строковое представление объекта PremiumSticker.
     @return строковое представление объекта PremiumSticker
     */
    @Override
    public String toString() {
        return this.name + " " + this.message + " " + this.price;
    }
    /**

     Вычисляет хеш-код объекта PremiumSticker.
     @return хеш-код объекта PremiumSticker
     */
    @Override
    public int hashCode() {
        int result = 19;
        result = 29 * result + this.name.hashCode();
        result = 29 * result + this.message.hashCode();
        result = 29 * result + this.price;
        return result;
    }
    /**

     Сравнивает объект PremiumSticker с другим объектом на равенство.
     @param obj объект для сравнения
     @return true, если объекты равны, false - в противном случае
     */
    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
