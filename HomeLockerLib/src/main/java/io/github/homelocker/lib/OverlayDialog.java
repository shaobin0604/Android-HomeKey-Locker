package io.github.homelocker.lib;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;

import static android.view.WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
import static android.view.WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED;
import static android.view.WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;

/**
 * Created by shaobin on 3/20/14.
 */
public class OverlayDialog extends AlertDialog {
    private final Activity mActivity;

    public OverlayDialog(Activity activity) {
        super(activity, R.style.OverlayDialog);
        mActivity = activity;
        LayoutParams layoutparams = getWindow().getAttributes();
        layoutparams.type = TYPE_SYSTEM_ALERT;
        layoutparams.dimAmount = 0.0F; // transparent
        layoutparams.width = 0;
        layoutparams.height = 0;
        layoutparams.gravity = Gravity.BOTTOM;
        getWindow().setAttributes(layoutparams);
        getWindow().setFlags(FLAG_SHOW_WHEN_LOCKED | FLAG_NOT_TOUCH_MODAL, 0xffffff);
        setOwnerActivity(activity);
        setCancelable(false);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent) {
        return true;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout framelayout = new FrameLayout(getContext());
        framelayout.setBackgroundColor(0);
        setContentView(framelayout);
    }
}
