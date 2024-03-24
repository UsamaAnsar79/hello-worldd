package AbstractFactory;

public interface AbstractFactory {
    ICourse GetCourse();
    ISource GetSource();
}
class OfflineFactory implements AbstractFactory{
    @Override
    public ICourse GetCourse() {
        return new Backend();
    }

    @Override
    public ISource GetSource() {
        return new Offline();
    }
}
class OnlineFactory implements AbstractFactory{
    @Override
    public ICourse GetCourse() {
        return new Frontend();
    }

    @Override
    public ISource GetSource() {
        return new Online();
    }
}