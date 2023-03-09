import java.util.Comparator;

public class UniversityStudyProfileComparator implements UniversityComparator {
    @Override
    public int compare(University o1, University o2) {
        return o1.getStudyProfile().compareTo(o2.getStudyProfile());
    }
}
