package y1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f26638d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f26639a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f26640b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f26641c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f26639a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a9 = a(viewGroup.getChildAt(childCount));
                    if (a9 != null) {
                        return a9;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                throw h3.o.i(size, arrayList);
            }
        }
        return null;
    }
}
