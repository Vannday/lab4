public  class MilitaryPlane implements Airplane {
    private String information;

    @Override
    public void passTechnicalInspection() {
        System.out.println("Военный самолет прошел техосмотр");
    }
    
    @Override
    public void repair() {
        System.out.println("Военный самолет отремонтирован");
    }
    
    @Override
    public void fly() {
        System.out.println("Военный самолет совершает рейс");
    }
    
    @Override
    public void refuel() {
        System.out.println("Военный самолет заправлен");
    }
    
    @Override
    public String getInformation() {
        return information;
    }
    
    @Override
    public void setInformation(String info) {
        information = info;
    }
}