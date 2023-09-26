package phaseEnd;

import java.util.*;
class PropertyOperations {
    private ArrayList<Property> properties = new ArrayList<>();

    public void addPropertyDetails(Property property) {
        getProperties().add(property);
    }

    public void viewPropertyDetails() {
        if (getProperties().isEmpty()) {
            System.out.println("No Data Present at This Moment");
        } else {
        	System.out.println("=========================================================================================================");
            System.out.println("ID\tBase Value\tIs In City\tAge(years)\tBuilt-up Area\tTax");
        	System.out.println("=========================================================================================================");
            for (Property property : getProperties()) {
                double propertyTax = calculatePropertyTax(property);
                property.setPropertyTax(propertyTax);
                System.out.printf(property.id + "\t" + property.baseValueOfLand + "\t" + property.isInCity + "\t\t" + property.ageOfProp + "\t\t" + property.builtupArea + "\t\t" + propertyTax + "/-"  + "\n" );
            	System.out.println("=====================================================================================================");
            }

        }
    }

    public double calculatePropertyTax(Property property) {
        double baseValue = property.baseValueOfLand;
        char isInCity = Character.toUpperCase(property.isInCity);
        int age = property.ageOfProp;

        double tax;
        if (isInCity == 'Y') {
            tax = (baseValue * age * 0.5) + (0.5 * baseValue);
        } else if (isInCity == 'N') {
            tax = baseValue * age * 0.5;
        } else {
            throw new IllegalArgumentException("Invalid input for property location. Use 'Y' or 'N'.");
        }

        return tax;
    }

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}
}

