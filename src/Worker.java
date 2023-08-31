public class Worker implements IEatable,IPayable,IWorkable{
    @Override
    public void eat() {
        System.out.println("eat method");

    }

    @Override
    public void pay() {
        System.out.println("pay method");

    }

    @Override
    public void work() {
        System.out.println("work method");

    }
}
