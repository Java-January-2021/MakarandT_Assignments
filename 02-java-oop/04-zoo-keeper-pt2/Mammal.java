class Mammal {
    public int energyLevel;

    // Create a Mammal class that has an energyLevel and displayEnergy() method. The
    // displayEnergy() method should show the animals energy level as well as return
    // it.
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }
   
    public int displayEnergy(int energyLevel) {
        System.out.println(energyLevel);
        return energyLevel;
    }

    // Getter
    public int getEnergyLevel() {
        return energyLevel;
    }

    // Setter
    public void setEnergyLevel() {
        this.energyLevel = energyLevel;
    }

  

   
}