package com.java.map;

import java.util.Objects;

class Name implements Comparable<Name>{
	private String name;

	public Name() {
		
	}
	
	public Name(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Name obj) {
		
		return this.name.compareTo(obj.getName());
	}
	
}

public class SmthMore {

	public static void main(String[] args) {
		

	}

}
