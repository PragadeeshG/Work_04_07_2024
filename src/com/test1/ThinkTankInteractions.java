package com.test1;

public class ThinkTankInteractions {
	private Integer interactionCode;
	private String companyCaseStudystudyRefrencesRef;
	private boolean studyRefrencesValid;
	private Integer contentCode;
	private String content;
	private String metadata;
	private Integer keyIdentifier;
	private Integer secretCode;
	private String keyRotationClient;
	private Integer interactionReference;
	private String keyRotationSchedule;
	private String status;
	private String remarks;

	public ThinkTankInteractions() {

	}

	public ThinkTankInteractions(Integer interactionCode, String companyCaseStudystudyRefrencesRef,
			boolean studyRefrencesValid, Integer contentCode, String content, String metadata, Integer keyIdentifier,
			Integer secretCode, String keyRotationClient, Integer interactionReference, String keyRotationSchedule,
			String status, String remarks) {
		super();
		this.interactionCode = interactionCode;
		this.companyCaseStudystudyRefrencesRef = companyCaseStudystudyRefrencesRef;
		this.studyRefrencesValid = studyRefrencesValid;
		this.contentCode = contentCode;
		this.content = content;
		this.metadata = metadata;
		this.keyIdentifier = keyIdentifier;
		this.secretCode = secretCode;
		this.keyRotationClient = keyRotationClient;
		this.interactionReference = interactionReference;
		this.keyRotationSchedule = keyRotationSchedule;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getInteractionCode() {
		return interactionCode;
	}

	public void setInteractionCode(Integer interactionCode) {
		this.interactionCode = interactionCode;
	}

	public String getCompanyCaseStudystudyRefrencesRef() {
		return companyCaseStudystudyRefrencesRef;
	}

	public void setCompanyCaseStudystudyRefrencesRef(String companyCaseStudystudyRefrencesRef) {
		this.companyCaseStudystudyRefrencesRef = companyCaseStudystudyRefrencesRef;
	}

	public boolean isStudyRefrencesValid() {
		return studyRefrencesValid;
	}

	public void setStudyRefrencesValid(boolean studyRefrencesValid) {
		this.studyRefrencesValid = studyRefrencesValid;
	}

	public Integer getContentCode() {
		return contentCode;
	}

	public void setContentCode(Integer contentCode) {
		this.contentCode = contentCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getKeyIdentifier() {
		return keyIdentifier;
	}

	public void setKeyIdentifier(Integer keyIdentifier) {
		this.keyIdentifier = keyIdentifier;
	}

	public Integer getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(Integer secretCode) {
		this.secretCode = secretCode;
	}

	public String getKeyRotationClient() {
		return keyRotationClient;
	}

	public void setKeyRotationClient(String keyRotationClient) {
		this.keyRotationClient = keyRotationClient;
	}

	public Integer getInteractionReference() {
		return interactionReference;
	}

	public void setInteractionReference(Integer interactionReference) {
		this.interactionReference = interactionReference;
	}

	public String getKeyRotationSchedule() {
		return keyRotationSchedule;
	}

	public void setKeyRotationSchedule(String keyRotationSchedule) {
		this.keyRotationSchedule = keyRotationSchedule;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
