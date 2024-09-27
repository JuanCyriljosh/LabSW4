class AirConditioning implements HomeService {

    @Override
    public void turnOn() {

        System.out.println("The air conditioning is now on.");
    }

    @Override
    public void turnOff() {
        
        System.out.println("The air conditioning is now off.");
    }
}