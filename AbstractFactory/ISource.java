package AbstractFactory;

public interface ISource {
    String CourseName();
}
class Offline implements ISource{
    @Override
    public String CourseName() {
        return "Study at Campus";
    }
}
class Online implements ISource{
    @Override
    public String CourseName() {
        return "Study at Home";
    }
}
