public class CustomListAdapter extends ArrayAdapter<MyItem> {
	
    private Context context;

    public CustomListAdapter(Context context, List<MyItem> list) {
        super(context, 0, list);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_in_list, parent, false);
        }
		
        MyItem item = getItem(position);
		
	TextView title = (TextView) convertView.findViewById(R.id.textViewTitle);
	title.setText(item.getTitle() + position);
		
        return convertView;
    }
}
