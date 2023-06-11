package com.temp;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CloseableExample implements Closeable {
    public static void main(String[] args) {

        //valid Class within Try-With
        try (FileInputStream fis = new FileInputStream("2")) {
            fis.available();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (CloseableExample closeableExample = new CloseableExample()) {
            closeableExample.clone();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void close() throws IOException {

    }
}
