package com.supermartijn642.rechiseled.chiseling;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Objects;

/**
 * Created 24/12/2021 by SuperMartijn642
 */
public class ChiselingEntry {

    private final Item regularItem;
    private final int regularItemData;
    private final Item connectingItem;
    private final int connectingItemData;

    public ChiselingEntry(Item regularItem, int regularItemData, Item connectingItem, int connectingItemData){
        this.regularItem = regularItem;
        this.regularItemData = regularItemData;
        this.connectingItem = connectingItem;
        this.connectingItemData = connectingItemData;
    }

    public boolean hasRegularItem(){
        return this.regularItem != null;
    }

    public boolean hasConnectingItem(){
        return this.connectingItem != null;
    }

    public Item getRegularItem(){
        return this.regularItem;
    }

    public Item getConnectingItem(){
        return this.connectingItem;
    }

    public int getRegularItemData(){
        return this.regularItemData;
    }

    public int getConnectingItemData(){
        return this.connectingItemData;
    }

    public ItemStack getRegularItemStack(){
        return new ItemStack(this.regularItem, 1, this.regularItemData);
    }

    public ItemStack getConnectingItemStack(){
        return new ItemStack(this.connectingItem, 1, this.connectingItemData);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;

        ChiselingEntry that = (ChiselingEntry)o;

        if(this.regularItemData != that.regularItemData) return false;
        if(this.connectingItemData != that.connectingItemData) return false;
        if(!Objects.equals(this.regularItem, that.regularItem)) return false;
        return Objects.equals(this.connectingItem, that.connectingItem);
    }

    @Override
    public int hashCode(){
        int result = this.regularItem != null ? this.regularItem.hashCode() : 0;
        result = 31 * result + this.regularItemData;
        result = 31 * result + (this.connectingItem != null ? this.connectingItem.hashCode() : 0);
        result = 31 * result + this.connectingItemData;
        return result;
    }
}
