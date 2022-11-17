package com.nt;

abstract class Bike{
	abstract int getWheels();
	}

class Auto extends Bike{
	int getWheels()
	{
		return 3;
	}
}

class Honda extends Bike{
	int getWheels()
	{
		return 2;
	}
}
