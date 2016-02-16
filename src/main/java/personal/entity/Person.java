package personal.entity;

public class Person {
    private Integer id;

    private String name;

    private String gender;

    private Integer age;

    private Integer addressId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", addressId="
				+ addressId + "]";
	}
    
    
}