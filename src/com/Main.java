package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("temp.txt");
            FileInputStream fis = new FileInputStream(file);
            Connection connection = DriverManager.getConnection("", "", "");
        } catch (FileNotFoundException e) {
        } catch (IOException | SQLException e) {

        }
    }
}
