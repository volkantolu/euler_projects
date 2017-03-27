package home.ibow.mvc.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 23.Þub.2010
 * Time: 01:11:29
 */
public class VotingService {

    private List<Vote> votes = new ArrayList<Vote>();

    private Set<Observer> registry = new HashSet<Observer>();

    public void addVote(Vote vote) {
        votes.add(vote);
        notifyObservers();
    }

    public void clearVotes() {
        votes.clear();
        notifyObservers();
    }


    private void notifyObservers() {
        for (Observer ob : registry) {
            ob.update();
        }
    }

    public void attach(Observer ob) {
        registry.add(ob);
    }

    public void detach(Observer ob) {
        registry.remove(ob);
    }


    public List<Vote> getVotes() {
        return this.votes;
    }


}
