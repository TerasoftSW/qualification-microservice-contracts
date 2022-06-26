package com.terasoft.qualificationsbccontracts.events;

import lombok.Value;

@Value
public class QualificationCLCEdited {
    private String qualificationId;
    private String comment;
    private Integer score;
}
