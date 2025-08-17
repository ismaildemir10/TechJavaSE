package com.icd.files;

import java.io.File;
import java.util.Date;
import java.util.List;

public class FilePathDataImplement implements IFileLogTech{
    //Veriable
    private String id;
    private String filePathName;
    private String fileDirectoryName;
    private String url;
    private File file;
    private Date systemCreateDated;

    @Override
    public String logTechLocalDateTime() {
        return null;
    }

    @Override
    public String logTechFileReader(String fileName) {
        return null;
    }

    @Override
    public List<String> logTechFileList() {
        return null;
    }

    @Override
    public String logTechFileCreate(String fileName) {
        return null;
    }

    @Override
    public String logTechFileWriter(String fileName) {
        return null;
    }

    @Override
    public String logTechFileDelete(String fileName) {
        return null;
    }

    @Override
    public String logTechFileInformation() {
        return null;
    }
}
