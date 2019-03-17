package stream;

import java.io.UnsupportedEncodingException;

public class HexToKanji {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {(byte) 0xE5, (byte) 0xB1, (byte) 0x8C};
        String str = new String(bytes,"UTF-8");
        System.out.println("bytes is:" + str);
    }
}
