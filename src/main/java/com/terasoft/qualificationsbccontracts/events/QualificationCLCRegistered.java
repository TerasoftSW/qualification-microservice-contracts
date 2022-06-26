package com.terasoft.qualificationsbccontracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class QualificationCLCRegistered {
    private String qualificationId;
    private String comment;
    private Integer score;
    private String lawyerId;
    private String customerId;
    private String customLegalCaseId;
    private Instant occurredOn;
}
