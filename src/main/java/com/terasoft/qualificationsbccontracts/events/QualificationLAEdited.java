package com.terasoft.qualificationsbccontracts.events;

import lombok.Value;

@Value
public class QualificationLAEdited {
    private String qualificationId;
    private String comment;
    private Integer score;
}
