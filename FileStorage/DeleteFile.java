// internal storage
context.deleteFile("FileName");

// sdcard
new File(Environment.getExternalStorageDirectory().getPath() + "/" + "FileName").delete();