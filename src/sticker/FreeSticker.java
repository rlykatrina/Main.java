package sticker;

public class FreeSticker extends Sticker {

    /**

     Конструктор класса FreeSticker.
     @param name имя стикера
     @param message сообщение стикера
     */
    public FreeSticker(String name, String message) {
        super(name, message);
        this.price = 0;
    }
    /**

     Выводит статус стикера (бесплатный или нет).
     */
    @Override
    public void stickerStatus() {
        System.out.println("This sticker is free");
    }
    /**

     Возвращает строковое представление объекта FreeSticker.
     @return строковое представление объекта FreeSticker
     */
    @Override
    public String toString() {
        return this.name + " " + this.message + " " + this.price;
    }
    /**

     Вычисляет хеш-код объекта FreeSticker.
     @return хеш-код объекта FreeSticker
     */
    @Override
    public int hashCode() {
        int result = 21;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.message.hashCode();
        return result;
    }
    /**

     Сравнивает объект FreeSticker с другим объектом на равенство.
     @param obj объект для сравнения
     @return true, если объекты равны, false - в противном случае
     */
    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
