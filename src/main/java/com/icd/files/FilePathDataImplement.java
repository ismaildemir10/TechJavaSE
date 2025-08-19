package com.icd.files;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class FilePathDataImplement implements IFileLogTech{
    //Veriable
    private String id;
    private String filePathName;
    private String fileDirectoryName;
    private String url;
    private File file;
    private Date systemCreateDated;

    public FilePathDataImplement() {
        this.id = UUID.randomUUID().toString();
        this.systemCreateDated = new Date(System.currentTimeMillis());
        this.filePathName="\\car.txt";
        this.fileDirectoryName =FilePathUrl.MY_CAR_FILE_PATH_URL;
        this.url=fileDirectoryName.concat(filePathName);
        this.file = new File(url);
        try {
            if (file.exists()){
                System.out.println(url+" boyle bir dosya var");
            }else {
                file.createNewFile();
                System.out.println(url + "dosya oluşturuldu");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }

    @Override
    public String logTechLocalDateTime() {
        Locale locale = new Locale("tr","TR");
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzzz",locale);
        Date date = new Date();
        String changeDate = sdf.format(date);
        return changeDate;
    }

    @Override
    public void logTechFileReader() {
        String rows;
        StringBuilder builder=new StringBuilder();
        String builderToString;
        try(BufferedReader br = new BufferedReader(new FileReader(this.url))){
            while ((rows=br.readLine())!=null){
                builder.append(rows).append("\n");
            }
            builderToString=builder.toString();
            System.out.println("LOGLAMA:\n"+builderToString);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public File[] logTechFileList() {
        File fileList = new File(url);
        for(File temp : fileList.listFiles()){
            System.out.println(temp.getName());

        }
        return fileList.listFiles();
    }

    @Override
    public String logTechFileCreate(String fileName) {
        return null;
    }

    @Override
    public void logTechFileWriter(String username,String password) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.url,true))) {
            String nowDate=logTechLocalDateTime();
            String value = "["+nowDate+"] "+ username+" "+password+"\n";
            bw.write(value);
            System.out.println("eklendi");
            bw.flush();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String logTechFileDelete(String fileName) {
        return null;
    }

    @Override
    public String logTechFileInformation() {
        return null;
    }

    public static void main(String[] args) {
        FilePathDataImplement filePathDataImplement = new FilePathDataImplement();
        filePathDataImplement.logTechFileWriter("root","passwd");
        filePathDataImplement.logTechFileReader();

    }
}

