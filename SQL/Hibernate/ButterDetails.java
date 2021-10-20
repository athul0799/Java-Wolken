	package com.wolken.butterflies.entity;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Table;
	import javax.persistence.Id;
	
	@Entity
	@Table(name = "butterdetails")
	public class ButterDetails {
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "name")
		private String name;
		@Column(name = "family")
		private String family;
		@Column(name = "colour")
		private String colour;
		@Column(name = "size")
		private int size;
		@Column(name = "age")
		private int age;                            
		@Column(name = "type")
		private String type;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFamily() {
			return family;
		}
		public void setFamily(String Family) {
			this.family = family;
		}
		public int getColour() {
			return colour;
		}
		public void setColour(int colour) {
			this.colour = colour;
		}
		public int getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return "id = " + id + ", name = " + name + ", family = " + family + ", colour = "
					+ colour + ", size = " + size + "age = " + age + ", type = " + type;
		}
	}
}
