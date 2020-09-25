/**
 * This file is part of PacketWrapper.
 * Copyright (C) 2012-2015 Kristian S. Strangeland
 * Copyright (C) 2015 dmulloy2
 *
 * PacketWrapper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PacketWrapper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PacketWrapper.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.packetwrapper.abstractpackets;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientEnchantItem extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.ENCHANT_ITEM;
    
    public WrapperPlayClientEnchantItem() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientEnchantItem(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the ID sent by Open Window
     * @return The current Window ID
     */
    public int getWindowId() {
        return handle.getIntegers().read(0);
    }
    
    /**
     * Set Window ID.
     * @param value - new value.
     */
    public void setWindowId(byte value) {
        handle.getIntegers().write(0, (int) value);
    }
    
    /**
     * Retrieve Enchantment.
     * <p>
     * Notes: the position of the enchantment on the enchantment table window, starting with 0 as the topmost one.
     * @return The current Enchantment
     */
    public int getEnchantment() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set Enchantment.
     * @param value - new value.
     */
    public void setEnchantment(int value) {
        handle.getIntegers().write(1, value);
    }
    
}

