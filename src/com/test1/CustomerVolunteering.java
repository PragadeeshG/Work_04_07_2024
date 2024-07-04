package com.test1;

public class CustomerVolunteering {
	private String activityName;
	private String locationCode;
	private String officeName;
	private String venue;
	private String numberOfAccomodation;
	private String travelGuides;
	private String noshowRegisterations;
	private Integer spotRegisterations;
	private String ownTransportation;
	private String lineManagerApproval;
	private String entityState;

	public CustomerVolunteering() {

	}

	public CustomerVolunteering(String activityName, String locationCode, String officeName, String venue,
			String numberOfAccomodation, String travelGuides, String noshowRegisterations, Integer spotRegisterations,
			String ownTransportation, String lineManagerApproval, String entityState) {
		super();
		this.activityName = activityName;
		this.locationCode = locationCode;
		this.officeName = officeName;
		this.venue = venue;
		this.numberOfAccomodation = numberOfAccomodation;
		this.travelGuides = travelGuides;
		this.noshowRegisterations = noshowRegisterations;
		this.spotRegisterations = spotRegisterations;
		this.ownTransportation = ownTransportation;
		this.lineManagerApproval = lineManagerApproval;
		this.entityState = entityState;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getNumberOfAccomodation() {
		return numberOfAccomodation;
	}

	public void setNumberOfAccomodation(String numberOfAccomodation) {
		this.numberOfAccomodation = numberOfAccomodation;
	}

	public String getTravelGuides() {
		return travelGuides;
	}

	public void setTravelGuides(String travelGuides) {
		this.travelGuides = travelGuides;
	}

	public String getNoshowRegisterations() {
		return noshowRegisterations;
	}

	public void setNoshowRegisterations(String noshowRegisterations) {
		this.noshowRegisterations = noshowRegisterations;
	}

	public Integer getSpotRegisterations() {
		return spotRegisterations;
	}

	public void setSpotRegisterations(Integer spotRegisterations) {
		this.spotRegisterations = spotRegisterations;
	}

	public String getOwnTransportation() {
		return ownTransportation;
	}

	public void setOwnTransportation(String ownTransportation) {
		this.ownTransportation = ownTransportation;
	}

	public String getLineManagerApproval() {
		return lineManagerApproval;
	}

	public void setLineManagerApproval(String lineManagerApproval) {
		this.lineManagerApproval = lineManagerApproval;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
