public class Project {
    private String name;
    private String description;

    // Empty project
    public Project() {

    }

    // Project with name only
    public Project(String name) {
        this.name =name;

    }
    //Create an instance method called elevatorPitch that will return the name and description separated by a colon.
     elevatorPitch (String name, String description){
        System.out.println(name +" : "+ description);
    }

    // project with name and description
     Project(String name, String description) {
        this.name=name;
        this.description=description;

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
