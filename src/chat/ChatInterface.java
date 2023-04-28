package chat;

import sticker.Sticker;

public interface ChatInterface<T extends Sticker> {
    void addSticker(T sticker);
    void removeSticker(T sticker);
    int calculateStickersPrice();
    int calculateCountStickers();
    int calculateCountPremiumStickers();
    int calculateCountFreeStickers();
}
