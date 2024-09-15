package com.Assignment1_Program2.Ships;

public class Ship
{
    private String m_Name;
    private String m_YearBuilt;

    // Constructor
    public Ship(String name, String yearBuilt)
    {
        m_Name = name;
        m_YearBuilt = yearBuilt;
    }

    // Getters and Setters
    public String getName()
    {
        return m_Name;
    }

    public void setName(String name)
    {
        m_Name = name;
    }

    public String getYearBuilt()
    {
        return m_YearBuilt;
    }

    public void setYearBuilt(String yearBuilt)
    {
        m_YearBuilt = yearBuilt;
    }

    public void print()
    {
        System.out.println("Ship Name: " + m_Name + ", Year Built: " + m_YearBuilt);
    }
}
