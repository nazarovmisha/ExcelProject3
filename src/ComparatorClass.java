
public class ComparatorClass {
    private ComparatorClass() {
    }


    public static StudentComparator getStudentEnum(StudentEnum studentEnum) {


        switch (studentEnum) {
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            case CURRENT_COURSE_NUMBER:
                return new StudentCurrentCourseNumberComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            default:
                return new StudentAvgExamScoreComparator();
        }
    }

    public static UniversityComparator getUniversityEnum(UniversityEnum universityEnum) {
        switch (universityEnum) {
            case FULL_NAME:
                new UniversityFullNameComparator();
            case UNIVERSITY_ID:
                new UniversityIdComparator();
            case UNIVERSITY_SHORT_NAME:
                new UniversityShortNameComparator();
            case UNIVERSITY_YEAR_OF_FOUNDATION:
                new UniversityYearOfFoundationComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
