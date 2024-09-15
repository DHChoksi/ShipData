package com.Assignment1_Program2.Ships.ShipTest;

import com.Assignment1_Program2.Ships.*;

public class ShipDemo
{
    public static void main(String[] args)
    {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Pesse canoe", "7510");
        ships[1] = new CruiseShip("Royal Caribbean's Icon of the Seas", "2024", 7600);
        ships[2] = new CargoShip("MSC Irina", "2023", 21710);

        for (Ship ship : ships)
        {
            ship.print();
        }
    }
}
