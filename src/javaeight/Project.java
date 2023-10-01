package javaeight;

public class Project {

    private  Integer projectId;
    private String projectname;
    private String projectDescription;

    public Project(Integer projectId, String projectname, String projectDescription) {
        this.projectId = projectId;
        this.projectname = projectname;
        this.projectDescription = projectDescription;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectname='" + projectname + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                '}';
    }
}
