


import java.io.File;

public class RunFacadePattern {
    public static void main(String [] arguments){

        if (!(new File("data.ser").exists())){
            DataCreator.serialize("data.ser");
        }

      

        InternationalizationWizard wizard = new InternationalizationWizard();
        FacadeGui application = new FacadeGui(wizard);
        application.createGui();
        application.setNation(wizard.getNation("US"));
    }
}









