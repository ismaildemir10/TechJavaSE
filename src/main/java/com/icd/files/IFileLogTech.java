package com.icd.files;

import java.util.List;

public interface IFileLogTech {
    //LocaDateTİME
    public  String logTechLocalDateTime();
    //logTechFileWriter
    public  void logTechFileReader();
    public List<String> logTechFileList();
    public  String logTechFileCreate(String fileName);
    public  void logTechFileWriter(String username,String password);
    public  String logTechFileDelete(String fileName);
    public  String logTechFileInformation();
}
