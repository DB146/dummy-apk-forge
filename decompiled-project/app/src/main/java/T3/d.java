package T3;

import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9223a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f9224b;

    public d(e eVar) {
        this.f9224b = new WeakReference(eVar);
    }

    public d(j jVar) {
        this.f9224b = new WeakReference(jVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f9223a) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                e eVar = (e) this.f9224b.get();
                if (eVar == null) {
                    return true;
                }
                ArrayList arrayList = eVar.f9227b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = eVar.f9226a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int a9 = eVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int a10 = eVar.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (a9 <= 0 && a9 != Integer.MIN_VALUE) {
                    return true;
                }
                if (a10 <= 0 && a10 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((S3.g) ((h) it.next())).m(a9, a10);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(eVar.f9228c);
                }
                eVar.f9228c = null;
                arrayList.clear();
                return true;
            default:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                j jVar = (j) this.f9224b.get();
                if (jVar == null) {
                    return true;
                }
                ArrayList arrayList2 = jVar.f9235b;
                if (arrayList2.isEmpty()) {
                    return true;
                }
                ImageView imageView2 = jVar.f9234a;
                int paddingRight2 = imageView2.getPaddingRight() + imageView2.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
                int a11 = jVar.a(imageView2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                int paddingBottom2 = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
                ViewGroup.LayoutParams layoutParams4 = imageView2.getLayoutParams();
                int a12 = jVar.a(imageView2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                if (a11 <= 0 && a11 != Integer.MIN_VALUE) {
                    return true;
                }
                if (a12 <= 0 && a12 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it2 = new ArrayList(arrayList2).iterator();
                while (it2.hasNext()) {
                    ((S3.g) ((h) it2.next())).m(a11, a12);
                }
                ViewTreeObserver viewTreeObserver2 = imageView2.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(jVar.f9236c);
                }
                jVar.f9236c = null;
                arrayList2.clear();
                return true;
        }
    }
}
