package sticker;

public abstract class Sticker {

    /**

     Имя стикера.
     */
    protected String name;
    /**

     Сообщение стикера.
     */
    protected String message;
    /**

     Стоимость стикера.
     */
    protected int price;
    /**

     Конструктор класса Sticker.
     @param name имя стикера
     @param message сообщение стикера
     */
    public Sticker(String name, String message) {
        this.name = name;
        this.message = message;
    }
    /**

     Возвращает сообщение стикера.
     @return сообщение стикера
     */
    public String getMessage() {
        return message;
    }
    /**

     Устанавливает новое сообщение стикера.
     @param message новое сообщение стикера
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**

     Возвращает имя стикера.
     @return имя стикера
     */
    public String getName() {
        return name;
    }
    /**

     Устанавливает новое имя стикера.
     @param name новое имя стикера
     */
    public void setName(String name) {
        this.name = name;
    }
    /**

     Абстрактный метод, который выводит статус стикера (бесплатный или платный).
     */
    public abstract void stickerStatus();
    /**

     Возвращает стоимость стикера.
     @return стоимость стикера
     */
    public int getPrice() {
        return this.price;
    }
}
