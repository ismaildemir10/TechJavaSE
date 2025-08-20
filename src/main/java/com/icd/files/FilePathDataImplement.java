package com.icd.files;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
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
                System.err.println(url+" boyle bir dosya var");
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
        File fileList = new File(FilePathUrl.MY_CAR_FILE_PATH_URL);
        for(File temp : fileList.listFiles()){
            System.out.println(temp.getName());

        }
        return fileList.listFiles();
    }

    @Override
    public void logTechFileCreate(String url) {
        this.url=fileDirectoryName.concat(filePathName);
        this.file = new File(url);
        try {
            if (file.exists()){
                System.err.println(url+" boyle bir dosya var");
            }else {
                file.createNewFile();
                System.out.println(url + "dosya oluşturuldu");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

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
    public void logTechFileDelete() {
        Scanner scanner=new Scanner(System.in);
        logTechFileList();
        System.out.println("Lütfen silinecek dosyayı yazın ");
        String fileName = scanner.nextLine().concat(".txt");
        String url=fileDirectoryName.concat("\\").concat(fileName);
        System.out.println("Dosya Uzantısı");
        char chooise;
        System.out.println(fileName+" Dosyayı silmek istiyomusunuz ? E/H");
        chooise=scanner.nextLine().charAt(0);
        if (chooise == 'e'|| chooise =='E'){
            try {File fileDelete = new File(url);
                if (fileDelete.exists()){
                    fileDelete.delete();
                    System.out.println(fileName+" dosyanız silindi");
                }else {
                    System.out.println(fileName+"olmayan dosya silinemez");
                }

            }catch (Exception e){
                System.out.println(e.getMessage());

            }
        }else {
            System.out.println();
        }


    }

    @Override
    public void logTechFileInformation() {
        Scanner scannerFileInformation=new Scanner(System.in);
        logTechFileList();
        System.out.println("Lütfen bilgisini almak istediğin dosyayı yazın ");
        String fileNameInformation = scannerFileInformation.nextLine().concat(".txt");
        String url=fileDirectoryName.concat("\\").concat(fileNameInformation);
        System.out.println("Dosya Uzantısı");
        File file = new File(url);
        System.out.println("Çalışabilinir mi "+file.canExecute());
        System.out.println("Okunabilinir mi "+file.canRead());
        System.out.println("Yazılabilinir mi "+file.canWrite());
        System.out.println("Dosya mi "+file.isFile());
        System.out.println("Dizin mi "+file.isDirectory());
        System.out.println("Parent mi "+file.getParent());
        System.out.println("Gizli mi "+file.isHidden());
        System.out.println("Free HDD mi "+file.getFreeSpace());
        System.out.println("getTotalSpace mi "+file.getTotalSpace());
    }

    public static void main(String[] args) {
        FilePathDataImplement filePathDataImplement = new FilePathDataImplement();
        //filePathDataImplement.logTechFileWriter("root","passwd");
        // filePathDataImplement.logTechFileReader();
        //filePathDataImplement.logTechFileList();
        //filePathDataImplement.logTechFileCreate("C:\\io\\techcareer\\deneme.log");
        //filePathDataImplement.logTechFileDelete();
        filePathDataImplement.logTechFileInformation();

    }
}

