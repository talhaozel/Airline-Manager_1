
public class Flight implements Message {

	private String id;
	private String departure;
	private String arrival;
	private String plane;

	
	public Flight() {	
	}
	
	
	public Flight(String id,String departure, String arrival, String plane) {
		
		this.id = id;
		this.departure = departure;
		this.arrival = arrival;
		this.plane = plane;
		

	}


	public String getDeparture() {
		return departure;
	}


	public void setDeparture(String departure) {
		this.departure = departure;
	}


	public String getArrival() {
		return arrival;
	}


	public void setArrival(String arrival) {
		this.arrival = arrival;
	}


	public String getPlane() {
		return plane;
	}


	public void setPlane(String plane) {
		this.plane = plane;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String sendMessage() {

		return ("Have nice Flight");
	}
	
	@Override
	public String added() {

		return ("Flight added");
	}
	
	
	

}
