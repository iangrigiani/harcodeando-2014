/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.hardcodeando.ui.utils;

import ar.com.hardcodeando.dto.HillDTO;
import ar.com.hardcodeando.dto.MD5DTO;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nestor
 */
public class AlgorithmStateStorage {
    
    public final static String ALGO_NONE = "NONE";
    public final static String ALGO_HILL = "HILL";
    public final static String ALGO_NLFRS = "NLFRS";
    public final static String ALGO_RSA = "RSA";
    public final static String ALGO_DES = "DES";
    public final static String ALGO_MD5 = "MD5";
    
    public static void saveHill(String hilltxt, HillDTO hillDTO) throws IOException {
        Gson gson = new Gson();
        String header = "type:"+ALGO_HILL+"\n";
        String body = gson.toJson(hillDTO);
        String out = header.concat(body);
        SaveFile.getInstance().saveToFile(hilltxt, hilltxt, out);
       
    }
    
    public static void saveMD5(String filename, String path, MD5DTO md5DTO) throws IOException {
        Gson gson = new Gson();
        String header = "type:"+ALGO_MD5+"\n";
        String body = gson.toJson(md5DTO);
        String out = header.concat(body);
        SaveFile.getInstance().saveToFile(filename, path, out);
    }
    
    
    public static String getType(String pathFile) {
        String type = ALGO_NONE;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line;
            
            if ((line = reader.readLine()) != null) {
                String[] header = line.split(":");
                if (header.length == 2) {
                    type = header[1];
                } 
            }
            reader.close();
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", pathFile);
            e.printStackTrace();
            return null;
        }
        return type;
    }
    
    
    public static HillDTO loadHill(String pathFile) {
        StringBuilder sb = new StringBuilder();
        HillDTO hillDtoRetrieve;
        boolean isFirstLine = true;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line;
            
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = !isFirstLine; // skip
                } else {
                    sb.append(line);
                }
                
            }
            reader.close();
            Gson gson = new Gson();
            hillDtoRetrieve = gson.fromJson(sb.toString(), HillDTO.class);
            
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", pathFile);
            e.printStackTrace();
            return null;
        }
        return hillDtoRetrieve;
    }
    
    public static MD5DTO loadMD5(String pathFile) {
        StringBuilder sb = new StringBuilder();
        MD5DTO md5DtoRetrieve;
        boolean isFirstLine = true;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line;
            
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = !isFirstLine; // skip
                } else {
                    sb.append(line);
                }
                
            }
            reader.close();
            Gson gson = new Gson();
            md5DtoRetrieve = gson.fromJson(sb.toString(), MD5DTO.class);
            
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", pathFile);
            e.printStackTrace();
            return null;
        }
        return md5DtoRetrieve;
    }
}