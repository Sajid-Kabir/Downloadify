import java.io.FileOutputStream;

import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;

import java.net.URL;

public class Main {

    private static String ACCESS_KEY = "b42ea0717a184c07bbf0b8bc4823eeb5";

    private static String APIFLASH_ENDPOINT = "https://api.apiflash.com/v1/urltoimage";

    public static void main(String[] args) throws Exception {

        URL url = new URL(String.format("%s?access_key=%s&url=https://example.com", APIFLASH_ENDPOINT, ACCESS_KEY));

        InputStream inputStream = url.openStream();

        OutputStream outputStream = new FileOutputStream("screenshot.jpeg");

        byte[] b = new byte[2048];

        int length;

        while ((length = inputStream.read(b)) != -1) {

            outputStream.write(b, 0, length);

        }

        inputStream.close();

        outputStream.close();

    }

}
