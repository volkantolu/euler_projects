package home.ibow.mvc.controller;

import home.ibow.mvc.model.Observer;
import home.ibow.mvc.model.Vote;
import home.ibow.mvc.model.VotingService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 23.Þub.2010
 * Time: 01:30:34
 */
public class VoteController implements ActionListener, Observer {

    private VotingService votingService;

    public VoteController(VotingService votingService) {
        this.votingService = votingService;
    }


    public void actionPerformed(ActionEvent e) {
        votingService.addVote(new Vote(e.getActionCommand(), new Date()));
    }

    public void update() {
        // No-op
    }
}
