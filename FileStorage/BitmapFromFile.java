try {
	// internal storage
	FileInputStream is = openFileInput("FileName");
	
	// sdcard
	FileInputStream is = new FileInputStream(Environment.getExternalStorageDirectory().getPath() + "/" + "FileName");
	
	imageView.setImageBitmap(BitmapFactory.decodeStream(is));
}
catch (Exception e) {
	Log.e("FileInput", e.getMessage());
}