# If you want to create your QRCode scanning application using ZBar library
The "libs" folder must be placed in the same directory as your "src" and "build" folders.
The "jniLibs" folder must be placed in the same directory as your "java" and "res" folders.
In MainActivity.java you can see how to load the library. Added to that some heavy conversion functions you may need if you decide to scan both classic and inverted (light on dark) QR codes which was the biggest problem I encountered.
