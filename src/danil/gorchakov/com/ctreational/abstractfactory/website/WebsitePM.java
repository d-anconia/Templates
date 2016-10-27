package danil.gorchakov.com.ctreational.abstractfactory.website;

import danil.gorchakov.com.ctreational.abstractfactory.ProjectManagerImpl;

public class WebsitePM implements ProjectManagerImpl{
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
