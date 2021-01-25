public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return getVersionNumber() +" says "+ getRingTone();
        // your code here
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
        // your code here
    }
    @Override
    public void displayInfo() {
        System.out.println(getVersionNumber()+" from " +getCarrier());        
    }
}