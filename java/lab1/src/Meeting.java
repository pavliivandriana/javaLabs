import java.util.Date;

public class Meeting {
    public Meeting() {};
    public Meeting(String topic, int members) {
        this.date = new Date();
        this.topic = topic;
        this.membersNum = members;
    }

    Date date;
    String topic;
    int membersNum;
}
