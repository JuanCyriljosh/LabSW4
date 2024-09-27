class HomeInterface {

    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface(HomeService light, HomeService tv, HomeService airConditioning) {

        this.light = light;
        this.tv = tv;
        this.airConditioning = airConditioning;
    }

    public void controlServices(int option) {

        switch (option) {

            case 1:
                light.turnOn();
                break;
            case 2:
                light.turnOff();
                break;
            case 3:
                tv.turnOn();
                break;
            case 4:
                tv.turnOff();
                break;
            case 5:
                airConditioning.turnOn();
                break;
            case 6:
                airConditioning.turnOff();
                break;
            case 7:
                turnOnAll();
                break;
            case 8:
                turnOffAll();
                break;
            case 9:
                System.out.println("App is shutting down...");
                break;
            default:
                System.out.println("Invalid option. Please select a valid choice.");
        }
    }

    public void turnOnAll() {

        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}
