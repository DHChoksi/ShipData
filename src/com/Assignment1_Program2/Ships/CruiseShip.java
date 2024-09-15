package com.Assignment1_Program2.Ships;

public class CruiseShip extends Ship
{
    private int m_MaxPassengers;

    // Constructor
    public CruiseShip(String name, String yearBuilt, int maxPassengers)
    {
        super(name, yearBuilt);
        m_MaxPassengers = maxPassengers;
    }

    // Getter and Setter
    public int getMaxPassengers()
    {
        return m_MaxPassengers;
    }

    public void setMaxPassengers(int maxPassengers)
    {
        m_MaxPassengers = maxPassengers;
    }

    @Override
    public void print()
    {
        System.out.println("Cruise Ship Name: " + getName() + ", Max Passengers: " + m_MaxPassengers);
    }
}