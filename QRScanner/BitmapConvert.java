public class BitmapConvert {

    public static Integer sizeWidth;
    public static Integer sizeHeight;

    public static Bitmap createInvertedBitmap(Bitmap src, Integer width, Integer height) {

        sizeWidth = width;
        sizeHeight = height;

        ColorMatrix colorMatrix_Inverted =
                new ColorMatrix(new float[] {
                        -1,  0,  0,  0, 255,
                        0, -1,  0,  0, 255,
                        0,  0, -1,  0, 255,
                        0,  0,  0,  1,   0});

        ColorFilter ColorFilter_Sepia = new ColorMatrixColorFilter(
                colorMatrix_Inverted);

        Bitmap bitmap = Bitmap.createBitmap(sizeWidth, sizeHeight,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint();

        paint.setColorFilter(ColorFilter_Sepia);
        canvas.drawBitmap(src, 0, 0, paint);

        return bitmap;
    }


    public static int[] applyGrayScale(byte [] data, int width, int height) {
        int p;
        int size = width*height;
        int[] pixels = new int[size];
        for(int i = 0; i < size; i++) {
            p = data[i] & 0xFF;
            pixels[i] = 0xff000000 | p<<16 | p<<8 | p;
        }
        return pixels;
    }
}