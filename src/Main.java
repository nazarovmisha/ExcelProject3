
import java.io.IOException;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {
        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = ComparatorClass
                .getUniversityEnum(UniversityEnum.FULL_NAME);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student>students=Input.inputStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator=ComparatorClass.getStudentEnum(StudentEnum.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator.reversed())
                .forEach(System.out::println);
    }

}

