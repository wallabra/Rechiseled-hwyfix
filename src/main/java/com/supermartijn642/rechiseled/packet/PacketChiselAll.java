package com.supermartijn642.rechiseled.packet;

import com.supermartijn642.core.network.BasePacket;
import com.supermartijn642.core.network.PacketContext;
import com.supermartijn642.rechiseled.screen.BaseChiselingContainer;
import net.minecraft.inventory.Container;
import net.minecraft.network.PacketBuffer;

/**
 * Created 26/12/2021 by SuperMartijn642
 */
public class PacketChiselAll implements BasePacket {

    @Override
    public void write(PacketBuffer buffer){
    }

    @Override
    public void read(PacketBuffer buffer){
    }

    @Override
    public void handle(PacketContext context){
        Container container = context.getSendingPlayer().openContainer;
        if(container instanceof BaseChiselingContainer)
            ((BaseChiselingContainer)container).chiselAll();
    }
}
