package com.Assignment1_Program2.Ships;

public class CargoShip extends Ship
{
    private int m_CargoCapacity;

    // Constructor
    public CargoShip(String name, String yearBuilt, int cargoCapacity)
    {
        super(name, yearBuilt);
        m_CargoCapacity = cargoCapacity;
    }

    // Getter and Setter
    public int getCargoCapacity()
    {
        return m_CargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity)
    {
        m_CargoCapacity = cargoCapacity;
    }

    @Override
    public void print()
    {
        System.out.println("Cargo Ship Name: " + getName() + ", Cargo Capacity (tonnage): " + m_CargoCapacity);
    }

}
