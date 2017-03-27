package home.ibow.mvc;

import home.ibow.mvc.model.VotingService;
import home.ibow.mvc.view.VoteView;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 23.Þub.2010
 * Time: 01:38:03
 */
public class App {

    public static void main(String[] args) {
        new VoteView(new VotingService()).setVisible(true);
    }

}
