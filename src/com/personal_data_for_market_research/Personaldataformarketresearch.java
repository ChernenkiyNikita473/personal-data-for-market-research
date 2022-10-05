package com.personal_data_for_market_research;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Personaldataformarketresearch {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("personal data for market research.txt");

            if(file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Личные данные для исследования рынка");
            pw.println("+ 7 (911) 4421352 abc@mail.ru,");
            pw.println("cba@yandex.ru");
            pw.println("+ 7 (911) 4421357 bbb@mail.ru," + " iii@yandex.ru");
            pw.println("ccc@rambler.ru");
            pw.println("+7 (999) 3593087 mail@google.com");
            pw.close();

            br = new BufferedReader(new FileReader("personal data for market research.txt"));
            String line;
            while ((line = br.readLine()) !=null) {
                System.out.println("line");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }

}
