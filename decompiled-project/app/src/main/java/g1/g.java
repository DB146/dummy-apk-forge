package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f17309a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17310b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17311c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17313e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f17309a = Float.NaN;
        this.f17310b = Float.NaN;
        this.f17311c = Float.NaN;
        this.f17312d = Float.NaN;
        this.f17313e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f17313e);
                this.f17313e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f17312d = obtainStyledAttributes.getDimension(index, this.f17312d);
            } else if (index == 2) {
                this.f17310b = obtainStyledAttributes.getDimension(index, this.f17310b);
            } else if (index == 3) {
                this.f17311c = obtainStyledAttributes.getDimension(index, this.f17311c);
            } else if (index == 4) {
                this.f17309a = obtainStyledAttributes.getDimension(index, this.f17309a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
