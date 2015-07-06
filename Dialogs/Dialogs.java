public class Dialog {
	public static void alert(Context c, String title, String message, String button, OnClickListener callBack) {
		AlertDialog.Builder b = new AlertDialog.Builder(c);
		b.setTitle(title);
		b.setMessage(message);
		b.setNeutralButton(button, callBack);
		b.create().show();
	}
	
	public static Dialog progress(Context c, String title, String message) {
		ProgressDialog d = new ProgressDialog(c);
		d.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		d.setTitle(title);
		d.setMessage(message);
		d.show();
		return d;
	}
}