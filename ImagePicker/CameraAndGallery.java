Button gallery = (Button) findViewById(R.id.buttonGallery);
gallery.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {
		Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
		startActivityForResult(galleryIntent, Constant.CODE_GALLERY);
	}
});

Button camera = (Button) findViewById(R.id.buttonCamera);
camera.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		startActivityForResult(intent, Constant.CODE_CAMERA);
	}
});

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	if (resultCode == RESULT_OK) {
		if (requestCode == Constant.CODE_GALLERY) {
			try {
				bmp = MediaStore.Images.Media.getBitmap(this.getContentResolver(), data.getData());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if (requestCode == Constant.CODE_CAMERA) {
			Bundle extras = data.getExtras();
			bmp = (Bitmap) extras.get("data");
		}
		if (bmp != null) {
			imageView.setImageBitmap(bmp);
		}
	}
}