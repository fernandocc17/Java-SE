package clases;
import java.util.ArrayList;
import java.io.File;

import abstracts.ProjectDecorator;
public class SupportedProjectItem extends ProjectDecorator{
    private ArrayList supportingDocuments = new ArrayList();
    
    public SupportedProjectItem(){ }
    public SupportedProjectItem(File newSupportingDocument){
        addSupportingDocument(newSupportingDocument);
    }
    
    public ArrayList getSupportingDocuments(){
        return supportingDocuments;
    }
    
    public void addSupportingDocument(File document){
        if (!supportingDocuments.contains(document)){
            supportingDocuments.add(document);
        }
    }
    
    public void removeSupportingDocument(File document){
        supportingDocuments.remove(document);
    }
    
    public String toString(){
        return getProjectItem().toString() + EOL_STRING
            + "\tSupporting Documents: " + supportingDocuments;
    }
}