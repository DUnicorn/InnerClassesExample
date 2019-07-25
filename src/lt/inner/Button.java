package lt.inner;

public class Button {
	
	private String title;
	private OnClickListener onClickLister;
	
	oakeitimas master

	LOL LOL LOL {
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
