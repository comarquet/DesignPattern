package drawing.drivers;

import system.SystemInfo;
import system.SystemOS;

/**
 *  This is the service that allows to draw basic forms on OSX platform
 */
public class OSXDrawingDriver  {
        public void drawLine(int x, int y) throws Exception {
            this.checkOS();
            System.out.println("OSX : Ligne (" + x + ", " + y  + ")");
        }

        public void drawCircle(int x, int y, int radius) throws Exception {
            this.checkOS();
            System.out.println("OSX : Cercle (" + x + ", " + y + ") r = " + radius);
        }

        private void checkOS() throws Exception {
            if (SystemInfo.getCurrentOS() != SystemOS.OSX) {
                throw new Exception("Wrong OS !");
            }
        }
}

