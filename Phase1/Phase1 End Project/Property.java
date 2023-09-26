package phaseEnd;

class Property {
	int id;
    double baseValueOfLand;
    char isInCity;
    int ageOfProp;
    double propertyTax;
    double builtupArea;
    public Property() {
    }

    public Property(int id,double baseValueOfLand, char isInCity, int ageOfProp, double builtupArea) {
        this.id = id;
    	this.baseValueOfLand = baseValueOfLand;
        this.isInCity = isInCity;
        this.ageOfProp = ageOfProp;
        this.builtupArea = builtupArea;
    }
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBaseValueOfLand() {
        return baseValueOfLand;
    }

    public void setBaseValueOfLand(double baseValueOfLand) {
        this.baseValueOfLand = baseValueOfLand;
    }

    public char getIsInCity() {
        return isInCity;
    }

    public void setIsInCity(char isInCity) {
        this.isInCity = isInCity;
    }

    public int getAgeOfProp() {
        return ageOfProp;
    }

    public void setAgeOfProp(int ageOfProp) {
        this.ageOfProp = ageOfProp;
    }
    public double getBuiltupArea() {
        return builtupArea;
    }

    public void setBuiltupArea(double builtupArea) {
        this.builtupArea = builtupArea;
    }
    public double getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(double propertyTax) {
        this.propertyTax = propertyTax;
    }
}

