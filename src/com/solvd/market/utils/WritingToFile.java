package com.solvd.market.utils;


import com.solvd.market.shop.MilkProducts;


import java.io.*;

public class WritingToFile {

    public void WrToFile(String path, MilkProducts milkProducts){
        File file = new File(path);

            try (BufferedWriter bufer = new BufferedWriter(new FileWriter(file, true))) {
                bufer.write(String.valueOf(milkProducts));


            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }

            /*FileOutputStream fileOutputStream = new FileOutputStream(file, true);*/
           /* fileOutputStream.write(name.getBytes());
            fileOutputStream.write(date.getBytes());

            fileOutputStream.close();*/

    }
}
