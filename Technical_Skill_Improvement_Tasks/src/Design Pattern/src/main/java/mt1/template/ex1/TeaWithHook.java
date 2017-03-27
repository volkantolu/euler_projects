package mt1.template.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends MyCafeWithHook {
    @Override
    void brew() {
        System.out.println("Brew tea bag.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon.");

    }

    boolean customerWantsCondiments(){
        if(getUserInput().toLowerCase().startsWith("y")){
            return true;
        }
        else{
            return false;
        }
    }
    
    private String getUserInput(){
        String answer = null;
        System.out.print("Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException ex){

        }
        if(answer == null) answer = "no";
        return answer;
    }
}
