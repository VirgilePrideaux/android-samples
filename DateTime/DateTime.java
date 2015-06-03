public class DateTime {
    public static String get() {
        Calendar c = Calendar.getInstance();
        return String.format("%02d/%02d/%d",
                c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.MONTH),
                c.get(Calendar.YEAR));
    }
}