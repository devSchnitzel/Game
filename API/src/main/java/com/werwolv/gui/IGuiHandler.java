package com.werwolv.gui;

import com.werwolv.container.Container;
import com.werwolv.entities.EntityPlayer;
import com.werwolv.world.World;

public interface IGuiHandler {

    Gui getGuiFromID(int ID, EntityPlayer entityPlayer, World world, int x, int y);

    Container getInventoryFromID(int ID, EntityPlayer entityPlayer, World world, int x, int y);

}
