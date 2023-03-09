import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Input {

    private Input() {
    }

    public static List<Student> inputStudents(String str) throws IOException {
        List<Student> listStudents = new ArrayList();


        FileInputStream fis = new FileInputStream(str);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheetStudents = workbook.getSheetAt(0);
        Iterator<Row> rowIteratorStudents = sheetStudents.iterator();
        rowIteratorStudents.next();
        while (rowIteratorStudents.hasNext()) {
            Row rowStudents = rowIteratorStudents.next();
            Student student = new Student();
            listStudents.add(student);
            student.setUniversityId(rowStudents.getCell(0).getStringCellValue());
            student.setFullName(rowStudents.getCell(1).getStringCellValue());
            student.setCurrentCourseNumber((int) rowStudents.getCell(2).getNumericCellValue());
            student.setAvgExamScore((float) rowStudents.getCell(3).getNumericCellValue());

        }
        return listStudents;
    }

    public static List<University> inputUniversities (String str) throws IOException {
        List<University> listUniversities = new ArrayList();
        File file = new File(str);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheetUniversities = workbook.getSheetAt(1);
        Iterator<Row> rowIteratorUniversities = sheetUniversities.iterator();
        rowIteratorUniversities.next();
        while (rowIteratorUniversities.hasNext()) {
            Row rowUniversities = rowIteratorUniversities.next();
            University university = new University();
            listUniversities.add(university);
            university.setId(rowUniversities.getCell(0).getStringCellValue());
            university.setFullName(rowUniversities.getCell(1).getStringCellValue());
            university.setShortName(rowUniversities.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int) rowUniversities.getCell(3).getNumericCellValue());
            university.setStudyProfile(StudyProfile.valueOf
                    (StudyProfile.class, rowUniversities.getCell(4).getStringCellValue()));
        }
        return listUniversities;
    }
}
