package com.icd.files;

import java.io.File;

public interface IFileLogTech {
    //LocaDateTİME
    public  String logTechLocalDateTime();
    //logTechFileWriter
    public  void logTechFileReader();
    public File[] logTechFileList();
    public void logTechFileCreate(String fileName);
    public  void logTechFileWriter(String username,String password);
    public void logTechFileDelete();
    public void logTechFileInformation();
}
