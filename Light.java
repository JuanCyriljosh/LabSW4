class Light implements HomeService {

    @Override
    public void turnOn() {

        System.out.println("The lights are turned on.");
    }

    @Override
    public void turnOff() {
        
        System.out.println("The lights are turned off.");
    }
}