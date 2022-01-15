package com.innerclass;

public class CarMain {
	
	class Car{
		String carName;
		String carType;
		
		public Car(String name, String type) {
			this.carName = name;
			this.carType = type;
		}
		private String getCarName() {
			return this.carName;
		}
		
		class Engine{
			String engineType;
			void setEngine() {
				if(Car.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";
				}else if{
					this.engineType = "Bigger";
				}
			}else {
				this.engineType = "Bigger";
			}
		}
		String getEngineType() {
			return this.engineType;
		}
	}

	public static void main(String[] args) {
		
	}

}
