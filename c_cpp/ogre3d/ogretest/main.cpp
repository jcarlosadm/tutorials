/**
 * Compiling
 * g++ main.cpp -o main -lOgreMain -lOIS -lboost_system -lstdc++ -lboost_thread
 */
#include <OGRE/Ogre.h>
#include <boost/thread/thread.hpp>

int main(int argc, char *argv[])
{
   // the root
   Ogre::Root *root = new Ogre::Root("", "");

   // load the rendersystem
   #ifdef _DEBUG
      root->loadPlugin("RenderSystem_GL_d");
   #else
      root->loadPlugin("/usr/lib/x86_64-linux-gnu/OGRE-1.9.0/RenderSystem_GL.so");
   #endif
   root->setRenderSystem(*(root->getAvailableRenderers().begin()));
   root->initialise(false);

   // the window
   Ogre::RenderWindow *window = root->createRenderWindow("Hello World!", 800, 600, false);
   window->setActive(true);
   window->setAutoUpdated(true);
   window->setDeactivateOnFocusChange(false);

   Ogre::SceneManager *sceneMgr = root->createSceneManager(Ogre::ST_GENERIC);

   // viewport and camera
   Ogre::Camera *camera = sceneMgr->createCamera("cam");
   Ogre::Viewport *viewport = window->addViewport(camera);
   viewport->setClearEveryFrame(true);
   // TODO: set-up your camera

   // TODO: set-up your resources

   // TODO: set-up your lighting

   // TODO: create your objects

   // main loop
   while (true)
   {
      // TODO: do your game logic here

      Ogre::WindowEventUtilities::messagePump();

      if (!root->renderOneFrame())
         break;
      boost::this_thread::sleep(boost::posix_time::seconds(2));
      break;
   }

   // clean up
   delete root;

   // the end.
   return 0;
}

