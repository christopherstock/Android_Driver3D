/*  $Id: Shooter.java 1176 2012-03-28 22:54:10Z jenetic.bytemare@gmail.com $
 *  =======================================================================================
 */
    package de.christopherstock.android.lib;

    import  android.util.*;

    /******************************************************************************************
    *   The project's activity class.
    *
    *   @version    0.1
    *   @author     Christopher Stock
    *******************************************************************************************/
    public class Lib
    {
        public static final void DEBUG_OUT( Object msg )
        {
            Log.i( "info", "" + msg );
        }

        /******************************************************************************************
        *   Requests fullscreen canvas.
        *******************************************************************************************/
        public static final void delay( long time )
        {
            try
            {
                Thread.sleep( time );
            }
            catch ( Throwable t )
            {
            }
        }
    }
