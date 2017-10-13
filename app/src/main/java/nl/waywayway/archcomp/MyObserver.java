package nl.waywayway.archcomp;

import android.arch.lifecycle.*;
import android.content.*;
import android.view.KeyEvent.*;

public class MyObserver implements LifecycleObserver
{
	Context context;
	
	public MyObserver(Context context, Lifecycle lifecycle, Callback callback)
	{
		this.context = context;
	}
	
	@OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
	public void onResume()
	{
		
	}
	
	
	
}
