try {
	// internal storage
	FileOutputStream os = openFileOutput("FileName", Context.MODE_PRIVATE);
	
	// sdcard
	FileOutputStream os = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + "/" + "FileName");
	
	bitmap.compress(Bitmap.CompressFormat.PNG, 100, os);
	os.close();
}
catch (Exception e) {
	Log.e("FileOutput", e.getMessage());
}