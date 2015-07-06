public class MainActivity extends Activity {
    @Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		// load initial fragment into FrameView
		getFragmentManager().beginTransaction().add(R.id.fragmentContainer, new ExampleFragment(), Constant.FRAGMENT_TAG).commit();
		
		// how to know if a fragment is currently displayed
		getFragmentManager().findFragmentByTag(Constant.FRAGMENT_TAG).isVisible();
		
		// how to switch up fragments
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.fragmentContainer, new AnotherFragment(), Constant.FRAGMENT_ANOTHER_TAG);
		// specify that the replaced fragment will be accessible on back pressed
		transaction.addToBackStack(null);
		// or either pop fragment from the stack to avoid endless back mechanism
		getFragmentManager().popBackStack();
		// eventually commit the transaction
		transaction.commit();
	}
}