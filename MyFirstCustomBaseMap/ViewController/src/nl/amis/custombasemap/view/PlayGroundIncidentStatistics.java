package nl.amis.custombasemap.view;

import java.util.ArrayList;
import java.util.List;

public class PlayGroundIncidentStatistics {

    private List<PlaygroundIncident> playgroundIncidents = new ArrayList<PlaygroundIncident>();

    public void setPlaygroundIncidents(List<PlaygroundIncident> playgroundIncidents) {
        this.playgroundIncidents = playgroundIncidents;
    }

    public List<PlaygroundIncident> getPlaygroundIncidents() {
        return playgroundIncidents;
    }

    public PlayGroundIncidentStatistics() {
        super();
        playgroundIncidents.add(new PlaygroundIncident(4, "1", ""));
        playgroundIncidents.add(new PlaygroundIncident(1, "2", ""));
        playgroundIncidents.add(new PlaygroundIncident(2, "3", ""));
        playgroundIncidents.add(new PlaygroundIncident(1, "4", ""));
        playgroundIncidents.add(new PlaygroundIncident(9, "5", ""));
        playgroundIncidents.add(new PlaygroundIncident(3, "6", ""));
        playgroundIncidents.add(new PlaygroundIncident(0, "7", ""));
    }

    
    
}
