package com.icd.files;

import java.util.List;

public interface IFileLogTech {
    //LocaDateTİME
    public  String logTechLocalDateTime();
    //logTechFileWriter
    public  String logTechFileReader(String fileName);
    public List<String> logTechFileList();
    public  String logTechFileCreate(String fileName);
    public  String logTechFileWriter(String fileName);
    public  String logTechFileDelete(String fileName);
    public  String logTechFileInformation();
}
