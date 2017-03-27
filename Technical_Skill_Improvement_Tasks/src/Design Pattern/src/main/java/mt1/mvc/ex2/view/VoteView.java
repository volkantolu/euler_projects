package home.ibow.mvc.view;

import home.ibow.mvc.controller.VoteController;
import home.ibow.mvc.model.Observer;
import home.ibow.mvc.model.Vote;
import home.ibow.mvc.model.VotingService;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 23.sub.2010
 * Time: 01:22:15
 */
public class VoteView extends JFrame implements Observer {


    private VotingService votingService;

    private JPanel votePanel = new JPanel();

    public VoteView(VotingService votingService) {
        this.votingService = votingService;
        this.setLayout(new GridLayout(4, 1, 1, 1));
        GridLayout layout = new GridLayout(0, 1, 1, 1);
        votePanel.setLayout(layout);
        this.add(votePanel);
        drawVotes();
        JButton voteAButton = new JButton("A");
        JButton voteBButton = new JButton("B");
        JButton voteCButton = new JButton("C");
        this.add(voteAButton);
        this.add(voteBButton);
        this.add(voteCButton);
        // Create the controller
        VoteController controller = new VoteController(votingService);
        // Subscribe for notification        
        votingService.attach(controller);
        votingService.attach(this);
        voteAButton.addActionListener(controller);
        voteBButton.addActionListener(controller);
        voteCButton.addActionListener(controller);
        this.setBounds(300, 150, 300, 300);
        this.setMinimumSize(new Dimension(100, 100));
        this.setTitle("View");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void update() {
        drawVotes();
    }

    private void drawVotes() {
        votePanel.removeAll();
        for (Vote vote : votingService.getVotes()) {
            votePanel.add(new JLabel(vote.getDate() + "--->" + vote.getParty()));
        }
        votePanel.updateUI();
    }
}
