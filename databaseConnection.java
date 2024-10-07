/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Afei
 */
public class databaseConnection {
    public Map<String, String> ImportUsernameAndPassword() throws SQLException {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Map <String, String> returnMap = new HashMap<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.usernameandpassword;");
        while(resultSet.next()){
            returnMap.put(resultSet.getString("username"), resultSet.getString("passkey"));
        }
        return returnMap;

    }

    public String[][] ImportSoaldanJawabanMatkul1Bagian1() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban1_1;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul1Bagian2() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban1_2;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul1Bagian3() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban1_3;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul1Bagian4() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban1_4;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul2Bagian1() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban2_1;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul2Bagian2() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban2_2;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul2Bagian3() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban2_3;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul2Bagian4() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban2_4;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul3Bagian1() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban3_1;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul3Bagian2() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban3_2;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul3Bagian3() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban3_3;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul3Bagian4() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban3_4;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul4Bagian1() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban4_1;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul4Bagian2() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban4_2;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul4Bagian3() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban4_3;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
    public String[][] ImportSoaldanJawabanMatkul4Bagian4() throws SQLException {
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finprooop", "root", "edrico3105");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String [][] returnArray = new String[6][16];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM finprooop.soaldanjawaban4_4;");
        int i = 0;
        while(resultSet.next()){
            returnArray[0][i] = resultSet.getString("soal");
            returnArray[1][i] = resultSet.getString("jawaban1");
            returnArray[2][i] = resultSet.getString("jawaban2");
            returnArray[3][i] = resultSet.getString("jawaban3");
            returnArray[4][i] = resultSet.getString("jawaban4");
            returnArray[5][i] = resultSet.getString("kunciJawaban");
            i++;
        }
        return returnArray;
    }
}
