package DH2;

public class KLTN<T, V> {
    private String thesisName;
    private T student;
    private V supervisor;

    public KLTN(String thesisName, T student, V supervisor) {
        this.thesisName = thesisName;
        this.student = student;
        this.supervisor = supervisor;
    }

    public String getThesisName() {
        return thesisName;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    @Override
    public String toString() {
        return "KLTN{" +
                "thesis='" + thesisName + '\'' +
                ", student=" + student +
                ", supervisor=" + supervisor +
                '}';
    }
}
