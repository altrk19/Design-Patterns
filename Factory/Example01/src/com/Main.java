package com;

import com.factory.FileExporterFactory;
import com.factory.FileType;

public class Main {
    public static void main(String[] args) {
        String fileExcel = FileExporterFactory.getInstance(FileType.EXCEL)
                .export(" Test content ");
        System.out.println(fileExcel);

        String filePdf = FileExporterFactory.getInstance(FileType.PDF)
                .export(" Test content ");
        System.out.println(filePdf);
    }
}

//En basit haliyle, nesnelerin üretilme işlemini merkezi bir hale getirerek kod tekrarını önlememize yardımcı olan patterndir.
// Aynı abstractları inheritance almış nesnelerin üretimini yapan pattern de diyebiliriz.