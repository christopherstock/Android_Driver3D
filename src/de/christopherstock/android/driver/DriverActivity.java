/*  $Id: Shooter.java 1176 2012-03-28 22:54:10Z jenetic.bytemare@gmail.com $
 *  =======================================================================================
 */
    package de.christopherstock.android.driver;

    import  android.view.*;
    import  de.christopherstock.android.lib.*;
    import  min3d.core.*;
    import  min3d.objectPrimitives.*;
	import 	min3d.parser.IParser;
	import 	min3d.parser.Parser;
	import  min3d.vos.*;

    /******************************************************************************************
    *   The project's activity class.
    *
    *   @version    0.1
    *   @author     Christopher Stock
    *******************************************************************************************/
    public class DriverActivity extends RendererActivity
    {
        public      static      DriverActivity          singleton               = null;

        public      static      DriverObstacle[]        obstacles              	= null;
        
        public		static		Object3dContainer		monster					= null;

        /******************************************************************************************
        *   Being invoked when the activity is created.
        *******************************************************************************************/
        @Override
        public void initScene()
        {
            Lib.DEBUG_OUT( "init scene" );

            
            
            /*
             * Add a light to the Scene.
             * The Scene must have light for Object3d's with normals
             * enabled (which is the default setting) to be visible.
             */
            
            scene.lights().add( new Light() );
            
            
            scene.lightingEnabled( true );

            
            obstacles = new DriverObstacle[]
            {
            	new DriverObstacle( new Number3d( -1.0f, 0.0f, 0.0f ) ),
            	new DriverObstacle( new Number3d( -1.0f, 0.0f, 1.0f ) ),
            	new DriverObstacle( new Number3d( -1.0f, 0.0f, 2.0f ) ),
            	new DriverObstacle( new Number3d( -1.0f, 0.0f, 3.0f ) ),
            	new DriverObstacle( new Number3d( -1.0f, 0.0f, 4.0f ) ),
            	new DriverObstacle( new Number3d( -1.0f, 0.0f, 5.0f ) ),

            	new DriverObstacle( new Number3d( 1.0f, 0.0f, 0.0f ) ),
            	new DriverObstacle( new Number3d( 1.0f, 0.0f, 1.0f ) ),
            	new DriverObstacle( new Number3d( 1.0f, 0.0f, 2.0f ) ),
            	new DriverObstacle( new Number3d( 1.0f, 0.0f, 3.0f ) ),
            	new DriverObstacle( new Number3d( 1.0f, 0.0f, 4.0f ) ),
            	new DriverObstacle( new Number3d( 1.0f, 0.0f, 5.0f ) ),

            	new DriverObstacle( new Number3d( 2.0f, 0.0f, 0.0f ) ),
            	new DriverObstacle( new Number3d( 2.0f, 0.0f, 1.0f ) ),
            	new DriverObstacle( new Number3d( 2.0f, 0.0f, 2.0f ) ),
            	new DriverObstacle( new Number3d( 2.0f, 0.0f, 3.0f ) ),
            	new DriverObstacle( new Number3d( 2.0f, 0.0f, 4.0f ) ),
            	new DriverObstacle( new Number3d( 2.0f, 0.0f, 5.0f ) ),
            };

            for ( DriverObstacle o : obstacles )
            {
            	scene.addChild( o.cube );
            }
            

/*            
            IParser parser = Parser.createParser
            ( 
            	Parser.Type.MAX_3DS,
                getResources(),
                getPackageName() + ":raw/monster_high",
                false
            );
            parser.parse();
            monster = parser.getParsedObject();
            monster.scale().x = monster.scale().y = monster.scale().z  = 1.0f;
            monster.position().x = 0.0f;
            monster.position().y = 0.0f;
            monster.position().z = 0.0f;
            
            scene.addChild( monster );
*/            
        }

        @Override
        public void updateScene()
        {
/*        	
            Lib.DEBUG_OUT( "update scene -  cam is [" + scene.camera().position + "]" );
            Lib.DEBUG_OUT( "update scene -  cam tg [" + scene.camera().target   + "]" );
            Lib.DEBUG_OUT( "                box is [" + cube1.position() + "]" );
*/
        	
        	
        	
         //scene.camera().target = monster.position();
           DriverCamera.update( scene.camera() );
        	
        	

            //cube1.position().setAllFrom( vertexCube1 );

            //scene.camera().target.setAll(   0, 0, 0 );

            /*
             * Do any manipulation of scene properties or to objects in the scene here.
             */

        }

        @Override
        public boolean onKeyDown( int i, KeyEvent ke )
        {
            //Lib.DEBUG_OUT( "key down: " + ke.getKeyCode() );




            switch ( ke.getKeyCode() )
            {
                case KeyEvent.KEYCODE_DPAD_DOWN:
                {
                	DriverCamera.position.z -= 0.1f;
                	DriverCamera.target.z   -= 0.1f;
                    break;
                }

                case KeyEvent.KEYCODE_DPAD_UP:
                {
                	DriverCamera.position.z += 0.1f;
                	DriverCamera.target.z   += 0.1f;
                    break;
                }

                case KeyEvent.KEYCODE_DPAD_LEFT:
                {
                	DriverCamera.position.x += 0.1f;
                	DriverCamera.target.x   += 0.1f;
                    break;
                }

                case KeyEvent.KEYCODE_DPAD_RIGHT:
                {
                	DriverCamera.position.x -= 0.1f;
                	DriverCamera.target.x   -= 0.1f;
                    break;
                }
            }

            return true;
        }
    }
