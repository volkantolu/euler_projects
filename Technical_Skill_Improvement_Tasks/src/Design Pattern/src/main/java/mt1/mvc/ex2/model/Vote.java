package home.ibow.mvc.model;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ibow
 * Date: 23.Þub.2010
 * Time: 01:09:49
 */
public class Vote {

    private String party;
    private Date date;

    public Vote(String party, Date date) {
        this.party = party;
        this.date = date;
    }

    public String getParty() {
        return party;
    }

    public Date getDate() {
        return date;
    }

}
