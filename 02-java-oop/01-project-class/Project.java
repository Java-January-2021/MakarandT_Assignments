public class Project {
    private String name;
    private String description;

    // Empty project
    public Project() {

    }

    // Project with name only
    public Project(String name) {
        this.name = name;

    }

    // project with name and description
    public Project(String name, String description) {
        this.name = name;
        this.description = description;

    }
    // Create an instance method called elevatorPitch that will return the name and
    // description separated by a colon.

    public String elevatorPitch() {
        if( getName() == null && getDescription() == null){
            return "No name" + " :  No Description";
        }
        if ( getDescription() == null){
            return getName() + " :  No Description";
        }
        return getName() + " : " + getDescription();
        // return this.name+ " : " + this.description;
        // String pitch = String.format("%s: %s", this.name, this.description);
        // return pitch;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
