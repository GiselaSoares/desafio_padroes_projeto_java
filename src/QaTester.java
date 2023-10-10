public class QaTester {
    private String name;
    private int memberId;       
    
    private static QaTester instance;                               

    public QaTester(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public static synchronized QaTester getInstance(String name, int memberId) {
        if (instance == null) {
            instance = new QaTester(name, memberId);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "QaTester{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}