package com.solvd.market.utils;

import com.solvd.market.shop.MeatProduct;

import javax.naming.Context;
import java.io.*;

public class WritingToFile {

    public void WritingToFile(String path, String name, String date){
        File file = new File(path);


            /*PrintWriter pw = new PrintWriter(file.getAbsoluteFile(), true);
            pw.print(name);*/
            try (BufferedWriter bufer = new BufferedWriter(new FileWriter(file, true))) {
                bufer.write(name);
                bufer.newLine();
                bufer.write(date);
                bufer.newLine();
                bufer.newLine();

            }catch (IOException e){
                e.printStackTrace();
            }

            /*FileOutputStream fileOutputStream = new FileOutputStream(file, true);*/
           /* fileOutputStream.write(name.getBytes());
            fileOutputStream.write(date.getBytes());

            fileOutputStream.close();*/

    }
}
