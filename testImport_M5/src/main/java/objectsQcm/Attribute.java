package objectsQcm;

public class Attribute {

	public String Name;
	public String Type;
	public String Value;
	public Boolean isArray = false;
	
	public Attribute(String Name, String Type, Boolean isArray)
	{
		this.Name = Name;
		this.Type = Type;
		this.isArray = isArray;
	
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	
	
}
