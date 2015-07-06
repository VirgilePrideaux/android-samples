public class Preferences {
	private static SharedPreferences get(Context context) {
		return context.getSharedPreferences(Constant.APP_TAG, Context.MODE_PRIVATE);
	}
	
	public static String get(Context context, String key) {
		return Preferences.get(context).getString(key, null);
	}
	
	/*
	** passing null as content deletes the chosen preference
	*/
	public static void update(Context context, String key, String content) {
		Editor editor = Preferences.get(context).edit();
		editor.putString(key, content);
		editor.commit();
	}
}