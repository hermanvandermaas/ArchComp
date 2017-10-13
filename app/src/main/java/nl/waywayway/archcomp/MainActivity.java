package nl.waywayway.archcomp;

import android.arch.lifecycle.*;
import android.os.*;

public class MainActivity extends LifecycleActivity
{
	MyObserver myObserver;
	Lifecycle lifecycle;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		lifecycle = getLifecycle();
    }
}
