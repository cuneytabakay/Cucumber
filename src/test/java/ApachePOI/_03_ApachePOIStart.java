package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        // Dosyanın yolu alındı
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz:
        // böylece program ile dosya arasında baglantı oluştu
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);


        //Dosya okuma işlemcisi üzerinden çalışma kitabını alıyorum
        //hafızada workbook u alıp oluşturuldu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);


        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi= calismaKitabi.getSheet("Sheet1");
        // Sheet calismaSayfası=calismaKitabi.getSheetAt(0);


        // istenen satırı alıyorum
        Row satir= calismaSayfasi.getRow(0);

        //istenen satırdaki istenen hücre aliniyor
        Cell hucre= satir.getCell(0);

        System.out.println("hucre = " + hucre);




    }
}
