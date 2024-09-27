class Tv implements HomeService {

    @Override
    public void turnOn() {

        System.out.println("The TV is now on.");
    }

    @Override
    public void turnOff() {
        
        System.out.println("The TV is now off.");
    }
}
