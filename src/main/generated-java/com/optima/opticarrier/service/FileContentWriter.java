package com.optima.opticarrier.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class FileContentWriter {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FileContentWriter.class);

    public void saveToFile(String path, String fileName, String content) {

        if(!path.endsWith("/")){
            path+="/";
        }
        saveToFile(path + fileName, content);
    }

    public void saveToFile(String path, String content)  {

        FileWriter fileWriter = null;
        File file = new File(path);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException e){
            log.error("Can't write to file");
        } finally {
            try {
                if(fileWriter!= null){
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                log.error("Can't close a fileWriter");
            }
        }
    }
}
