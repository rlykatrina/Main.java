import channel.Channel;
import chat.Chat;
import sticker.FreeSticker;
import sticker.PremiumSticker;

public class Main {
    public static void main(String[] args) {
        var st1 = new FreeSticker("n", "hello");
        var st2 = new FreeSticker("m", "agrrrr");
        var pst1 = new PremiumSticker("pn", "p hello", 120);
        var pst2 = new PremiumSticker("pm", "p agrrrr", 152);

        var chat = new Chat<>("test");

        var channel = new Channel("testName", "test description");

        System.out.println(st1.getName());
        System.out.println(st1.getMessage());
        System.out.println(st1.getPrice());
        System.out.println(st1.toString());
        st1.stickerStatus();
        System.out.println();

        System.out.println(pst1.getName());
        System.out.println(pst1.getMessage());
        System.out.println(pst1.getPrice());
        System.out.println(pst1.toString());
        pst1.stickerStatus();
        System.out.println();

        System.out.println(chat.getName());
        System.out.println(chat.getPremiumStatus());
        System.out.println(chat.getFreeCountPeople());
        System.out.println(chat.getPremiumCountPeople());
        System.out.println(chat.getCountPeople());
        System.out.println(chat.getStickersList());
        chat.addSticker(st1);
        chat.addSticker(st2);
        chat.addSticker(pst1);
        chat.addSticker(pst2);
        System.out.println(chat.getStickersList());
        chat.removeSticker(st1);
        System.out.println(chat.getStickersList());
        System.out.println(chat.calculateCountStickers());
        System.out.println(chat.calculateCountFreeStickers());
        System.out.println(chat.calculateCountPremiumStickers());
        System.out.println(chat.calculateStickersPrice());

        System.out.println(channel.getName());
        System.out.println(channel.getChannelDescription());
        System.out.println(channel.getChatsList());
        channel.addChat(chat);
        System.out.println(channel.getChatsList());
        channel.removeChat(chat);
        System.out.println(channel.getChatsList());

    }
}