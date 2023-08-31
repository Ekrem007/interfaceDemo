public class OutSourceWorker implements IWorkable,IPayable{
    @Override
    public void pay() {
        System.out.println("pay method");

    }

    @Override
    public void work() {
        System.out.println("work method");

    }
}
