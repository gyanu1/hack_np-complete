package com.lftechnology.childtutor;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lftechnology.childtutor.model.Lesson;

public class LessonPlayAdapter extends PagerAdapter {
	Context context=null;
	Lesson data=null;
	static class ViewHolder {
         String soundPath;
		 ImageView image;
	}
	
	public LessonPlayAdapter(Context context, Lesson data){
		this.context=context;
		this.data=data;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0 == ((View) arg1);
	}
	
	public Object instantiateItem(View convertView, int position) {
		 
		ViewHolder holder;
		Lesson.Page page;
		if (convertView == null) { // if it's not recycled, initialize some
									// attributes
			page=this.data.getNextPage() ;
			while(page != null){
			LayoutInflater inflater = (LayoutInflater) convertView.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.current_page, null);
			holder = new ViewHolder();			
			holder.image = (ImageView) convertView.findViewById(R.id.current_image);
			//holder.image.setImageURI(R.drawable.logo);
			//holder.image.setBackground(this.context.getResources().getDrawable(R.drawable.logo));
			convertView.setTag(holder);
			}

		} else {
			holder = (ViewHolder) convertView.getTag();
		}
//		holder.text.setText(label[position]);
//		holder.text.setCompoundDrawablesWithIntrinsicBounds(BankTransactionAdapter.this.mThumbIds[position], 0, 0, 0);
//	//	holder.icon.setImageResource(mThumbIds[position]);
		return convertView;
	}

	@Override
	public void destroyItem(View arg0, int arg1, Object arg2) {
		((ViewPager) arg0).removeView((View) arg2);
	}
 
 
//	@Override
//	public Parcelable saveState() {
//		return null;
//	}
// 


}
