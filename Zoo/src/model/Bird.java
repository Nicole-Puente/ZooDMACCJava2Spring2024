package model;

public class Bird {
	private String habitat;
	private String name;
	private int length;
	/**
	 * 
	 */
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param habitat
	 * @param name
	 * @param length
	 */
	public Bird(String habitat, String name, int length) {
		super();
		this.habitat = habitat;
		this.name = name;
		this.length = length;
	}
	/**
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}
	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Bird [habitat=" + habitat + ", name=" + name + ", length=" + length + "]";
	}
	
	public String makeNoise() {
		return "Tweet Tweet Tweet";
	}

	
	

	
	
	

}
