package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public final class NewRevisionFormatter implements Formatter{
    public String format (Revision revision){
        return String.format("At the time of: '%s', '%s' made a change",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp),
        revision.name);
    }
}
