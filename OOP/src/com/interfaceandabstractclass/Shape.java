package com.interfaceandabstractclass;

abstract class Shape {
	protected Point position;
	abstract double computeArea();
	public Point getPosition() {
		return this.position	}
}
