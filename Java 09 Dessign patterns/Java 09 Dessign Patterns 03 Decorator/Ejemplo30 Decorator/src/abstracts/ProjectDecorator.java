package abstracts;
import interfaces.ProjectItem;

public abstract class ProjectDecorator implements ProjectItem{
    private ProjectItem projectItem;
    
    protected ProjectItem getProjectItem(){ return projectItem; }
    public void setProjectItem(ProjectItem newProjectItem){ projectItem = newProjectItem; }
    
    public double getTimeRequired(){
        return projectItem.getTimeRequired();
    }
}