package com.icd.files;

import java.io.File;

public interface IFileLogTech {
    //LocaDateTİME
    public  String logTechLocalDateTime();
    //logTechFileWriter
    public  void logTechFileReader();
    public File[] logTechFileList();
    public  String logTechFileCreate(String fileName);
    public  void logTechFileWriter(String username,String password);
    public  String logTechFileDelete(String fileName);
    public  String logTechFileInformation();
}
