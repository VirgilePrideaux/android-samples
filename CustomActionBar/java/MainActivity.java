public class MainActivity extends CustomActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_main, (FrameLayout) findViewById(R.id.frameLayoutContainer));
    }
}
