package com.thevoxelbox.voxelsniper;

import com.thevoxelbox.voxelsniper.util.VoxelList;

import org.bukkit.World;

/**
 * @author Piotr
 */
public class SnipeData
{

    public static final int DEFAULT_REPLACE_DATA_VALUE = 0;
    public static final int DEFAULT_CYLINDER_CENTER = 0;
    public static final int DEFAULT_VOXEL_HEIGHT = 1;
    public static final int DEFAULT_BRUSH_SIZE = 3;
    public static final int DEFAULT_DATA_VALUE = 0;
    public static final int DEFAULT_REPLACE_ID = 0;
    public static final int DEFAULT_VOXEL_ID = 0;

    private final Sniper owner;
    private Message voxelMessage;
    /**
     * Brush size -- set blockPositionY /b #.
     */
    private int brushSize = SnipeData.DEFAULT_BRUSH_SIZE;
    /**
     * Voxel Id -- set blockPositionY /v (#,name).
     */
    private int voxelId = SnipeData.DEFAULT_VOXEL_ID;
    /**
     * Voxel Replace Id -- set blockPositionY /vr #.
     */
    private int replaceId = SnipeData.DEFAULT_REPLACE_ID;
    /**
     * Voxel 'ink' -- set blockPositionY /vi #.
     */
    private byte data = SnipeData.DEFAULT_DATA_VALUE;
    /**
     * Voxel 'ink' Replace -- set blockPositionY /vir #.
     */
    private byte replaceData = SnipeData.DEFAULT_REPLACE_DATA_VALUE;
    /**
     * Voxel List of ID's -- set blockPositionY /vl # # # -#.
     */
    private VoxelList voxelList = new VoxelList();
    /**
     * Voxel 'heigth' -- set blockPositionY /vh #.
     */
    private int voxelHeight = SnipeData.DEFAULT_VOXEL_HEIGHT;
    /**
     * Voxel centroid -- set Cylynder center /vc #.
     */
    private int cCen = SnipeData.DEFAULT_CYLINDER_CENTER;

    /**
     * @param vs
     */
    public SnipeData(final Sniper vs)
    {
        this.owner = vs;
    }

    /**
     * @return the brushSize
     */
    public final int getBrushSize()
    {
        return this.brushSize;
    }

    /**
     * @return the cCen
     */
    public final int getcCen()
    {
        return this.cCen;
    }

    /**
     * @return the data
     */
    public final byte getData()
    {
        return this.data;
    }

    /**
     * @return the replaceData
     */
    public final byte getReplaceData()
    {
        return this.replaceData;
    }

    /**
     * @return the replaceId
     */
    public final int getReplaceId()
    {
        return this.replaceId;
    }

    /**
     * @return the voxelHeight
     */
    public final int getVoxelHeight()
    {
        return this.voxelHeight;
    }

    /**
     * @return the voxelId
     */
    public final int getVoxelId()
    {
        return this.voxelId;
    }

    /**
     * @return the voxelList
     */
    public final VoxelList getVoxelList()
    {
        return this.voxelList;
    }

    /**
     * @return the voxelMessage
     */
    public final Message getVoxelMessage()
    {
        return this.voxelMessage;
    }

    /**
     * @return World
     */
    public final World getWorld()
    {
        return this.owner.getPlayer().getWorld();
    }

    /**
     * @return Sniper
     */
    public final Sniper owner()
    {
        return this.owner;
    }

    /**
     * Reset to default values.
     */
    public final void reset()
    {
        this.voxelId = SnipeData.DEFAULT_VOXEL_ID;
        this.replaceId = SnipeData.DEFAULT_REPLACE_ID;
        this.data = SnipeData.DEFAULT_DATA_VALUE;
        this.brushSize = SnipeData.DEFAULT_BRUSH_SIZE;
        this.voxelHeight = SnipeData.DEFAULT_VOXEL_HEIGHT;
        this.cCen = SnipeData.DEFAULT_CYLINDER_CENTER;
        this.replaceData = SnipeData.DEFAULT_REPLACE_DATA_VALUE;
    }

    /**
     * @param message
     */
    public final void sendMessage(final String message)
    {
        this.owner.getPlayer().sendMessage(message);
    }

    /**
     * @param brushSize
     *         the brushSize to set
     */
    public final void setBrushSize(final int brushSize)
    {
        this.brushSize = brushSize;
    }

    /**
     * @param cCen
     *         the cCen to set
     */
    public final void setcCen(final int cCen)
    {
        this.cCen = cCen;
    }

    /**
     * @param data
     *         the data to set
     */
    public final void setData(final byte data)
    {
        this.data = data;
    }

    /**
     * @param replaceData
     *         the replaceData to set
     */
    public final void setReplaceData(final byte replaceData)
    {
        this.replaceData = replaceData;
    }

    /**
     * @param replaceId
     *         the replaceId to set
     */
    public final void setReplaceId(final int replaceId)
    {
        this.replaceId = replaceId;
    }

    /**
     * @param voxelHeight
     *         the voxelHeight to set
     */
    public final void setVoxelHeight(final int voxelHeight)
    {
        this.voxelHeight = voxelHeight;
    }

    /**
     * @param voxelId
     *         the voxelId to set
     */
    public final void setVoxelId(final int voxelId)
    {
        this.voxelId = voxelId;
    }

    /**
     * @param voxelList
     *         the voxelList to set
     */
    public final void setVoxelList(final VoxelList voxelList)
    {
        this.voxelList = voxelList;
    }

    /**
     * @param voxelMessage
     *         the voxelMessage to set
     */
    public final void setVoxelMessage(final Message voxelMessage)
    {
        this.voxelMessage = voxelMessage;
    }

    /**
     * @param vundo
     */
    public final void storeUndo(final com.thevoxelbox.voxelsniper.Undo vundo)
    {
        this.owner.storeUndo(vundo);
    }
}
