public enum StudyProfile {
    MEDICINE("Медицина"),
    PHYSICS("Физика"),
    MATHEMATICS("Математика"),
    LINGUISTICS  ("Лингвистика");
    public final String profileName;
    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
    public String getProfileName(){
        return this.profileName;
    }
}
