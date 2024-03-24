package AbstractFactory;

public interface ICourse {
    String CourseName();
    int CourseFee();
    String CourseDuration();
}
class Frontend implements ICourse{
    @Override
    public String CourseName() {
        return "HTML , CSS , JAVASRIPT, REACT";
    }

    @Override
    public String CourseDuration() {
        return "4 months";
    }

    @Override
    public int CourseFee() {
        return 10000;
    }
}
class Backend implements ICourse{
    @Override
    public String CourseName() {
        return "java ,dart, database, mysql";
    }

    @Override
    public String CourseDuration() {
        return "5 months";
    }

    @Override
    public int CourseFee() {
        return 15000;
    }}