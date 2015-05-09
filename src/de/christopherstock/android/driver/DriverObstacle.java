/*  $Id: Shooter.java 1176 2012-03-28 22:54:10Z jenetic.bytemare@gmail.com $
 *  =======================================================================================
 */
    package de.christopherstock.android.driver;

    import  min3d.core.*;
    import  min3d.objectPrimitives.*;
    import  min3d.vos.*;

    /******************************************************************************************
    *   The project's activity class.
    *
    *   @version    0.1
    *   @author     Christopher Stock
    *******************************************************************************************/
    public class DriverObstacle
    {
    	public			Object3dContainer		cube			= null;

        /******************************************************************************************
        *	Create an Object3d and add it to the scene.
        *  	In this case, we're creating a cube using the Box class, which extends Object3d.
        *  	Any Object3d must be declared with booleans that determine whether its vertices store:
        *   (a) U/V texture coordinates
        *   (b) Normals (required for shading based on light source/s)
        *   (c) Per-vertex color information
        *  	We're going to create a shaded cube without textures or colors, so for those arguments
        *  	we are using "false,true,false".
        ******************************************************************************************/
    	public DriverObstacle( Number3d aPosition )
    	{
    		//cube = new Box( 0.5f, 0.5f, 0.5f, null, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE );
    		
    	  //Color4 c4 = new Color4( 1.0f, 1.0f, 1.0f, 1.0f );
    		
    		cube = new Box( 0.5f, 0.5f, 0.5f );

    		
    		cube.position().setAllFrom( aPosition );
            
            //false is default
            cube.colorMaterialEnabled( true );
            cube.vertexColorsEnabled( true );

            
            
            
            
            //cube.vertices().colors();
            
            
            //cube.vertices().
            
            
            //cube.colors().set( 0, (short)255, (short)0, (short)0, (short)255 );
            
            
            
            
    	}
    }
