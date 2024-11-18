
public class addressclass {

	
	    // Attributes
	    private String street;
	    private String city;
	    private String state;
	    private String zipCode;

	    // Constructor to initialize all attributes
	    public addressclass(String street, String city, String state, String zipCode) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.zipCode = zipCode;
	    }

	    // Getter methods for each attribute
	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getState() {
	        return state;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    // Method to display the full address
	    public void displayAddress() {
	        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + zipCode);
	    }

	    // Main method to test the Address class
	    public static void main(String[] args) {
	    	addressclass address = new addressclass("WATHAR BK. VEER DAM", "SATARA", "MH", "415526");
	        address.displayAddress(); // Display the address
	    }
	}



/*Address: WATHAR BK. VEER DAM, SATARA, MH - 415526*/