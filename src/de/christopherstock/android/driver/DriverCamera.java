/*  $Id: Shooter.java 1176 2012-03-28 22:54:10Z jenetic.bytemare@gmail.com $
 *  =======================================================================================
 */
    package de.christopherstock.android.driver;

    import  android.view.*;
    import  de.christopherstock.android.lib.*;
    import  min3d.core.*;
    import  min3d.objectPrimitives.*;
    import  min3d.vos.*;

    /******************************************************************************************
    *   The project's activity class.
    *
    *   @version    0.1
    *   @author     Christopher Stock
    *******************************************************************************************/
    public class DriverCamera
    {
        public      static      Number3d                position    			= new Number3d( 0.0f, 0.0f, 0.0f );
        
      //public      static      Number3d                target      			= new Number3d( 0.0f, 0.0f, 0.0f );
        
        public      static      Number3d                target      			= new Number3d( 0.0f, 0.0f, 5.0f );
    
        public static final void update( CameraVo camera )
        {
        	camera.position = position;
        	camera.target   = target;
        	
        	
        	
        }
    }
