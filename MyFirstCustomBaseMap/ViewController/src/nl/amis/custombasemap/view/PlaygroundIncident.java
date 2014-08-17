package nl.amis.custombasemap.view;

public class PlaygroundIncident {
    public PlaygroundIncident() {
        super();
    }
    
    private Integer occurrences;
    private String location;
    private String comment;

    public PlaygroundIncident(Integer occurrences, String location, String comment) {
        super();
        this.occurrences = occurrences;
        this.location = location;
        this.comment = comment;
    }

    public void setOccurrences(Integer occurrences) {
        this.occurrences = occurrences;
    }

    public Integer getOccurrences() {
        return occurrences;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    
}
