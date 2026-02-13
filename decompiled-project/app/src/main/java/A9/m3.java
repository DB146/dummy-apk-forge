package A9;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Random;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class m3 extends EditText {

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f1283f = Pattern.compile("\\S+");

    /* renamed from: u, reason: collision with root package name */
    public static final Q1 f1284u = new Q1(3, Integer.class, "streamPosition");

    /* renamed from: a, reason: collision with root package name */
    public final Random f1285a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f1286b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f1287c;

    /* renamed from: d, reason: collision with root package name */
    public int f1288d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f1289e;

    public m3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.TextAppearance_Leanback_SearchTextEdit);
        this.f1285a = new Random();
    }

    public int getStreamPosition() {
        return this.f1288d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1286b = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_one), (int) (r0.getWidth() * 1.3f), (int) (r0.getHeight() * 1.3f), false);
        this.f1287c = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_two), (int) (r0.getWidth() * 1.3f), (int) (r0.getHeight() * 1.3f), false);
        this.f1288d = -1;
        ObjectAnimator objectAnimator = this.f1289e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("StreamingTextView");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y7.u0.R(callback, this));
    }

    public void setStreamPosition(int i7) {
        this.f1288d = i7;
        invalidate();
    }
}
