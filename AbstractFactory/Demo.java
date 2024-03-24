package AbstractFactory;
public class Demo {
    public static void main(String[] args){
        AbstractFactory onlinefactory=new OnlineFactory();
        var course=onlinefactory.GetCourse();
        System.out.println("front end course and source detail");
        System.out.println(course.CourseName());
        System.out.println(course.CourseDuration());
        System.out.println(course.CourseFee());
        var source=onlinefactory.GetSource();
        System.out.println(source.CourseName());

        System.out.println("........");
        AbstractFactory offlinefactory=new OfflineFactory();
        var course1=offlinefactory.GetCourse();
        System.out.println("BACKEND end course and source detail");
        System.out.println(course1.CourseName());
        System.out.println(course1.CourseDuration());
        System.out.println(course1.CourseFee());
        var source1=offlinefactory.GetSource();
        System.out.println(source1.CourseName());
    }
}