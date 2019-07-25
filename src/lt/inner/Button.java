package lt.inner;

public class Button {
	
	private String title;
	private OnClickListener onClickLister;
	
	pakeitimai second second

	public String getTitle() {
		return title;
	}

	public void setOnClickListener (OnClickListener onClickListener) {
	this.onClickLister = onClickListener;
}
	
	public void onClick() {
		this.onClickLister.onClick(this.title);
	}
	
	public interface OnClickListener{
		public void onClick(String title);
	}
	
}
