package a3;

import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final C0724a f12603a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f12604b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f12605c;

    /* JADX WARN: Type inference failed for: r0v0, types: [a3.A, a3.a] */
    static {
        ?? c0709a = new C0709A();
        c0709a.f12493T = false;
        c0709a.O(new C0730g(2));
        c0709a.O(new u());
        c0709a.O(new C0730g(1));
        f12603a = c0709a;
        f12604b = new ThreadLocal();
        f12605c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a3.x, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, u uVar) {
        ArrayList arrayList = f12605c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (uVar == null) {
            uVar = f12603a;
        }
        u clone = uVar.clone();
        c(viewGroup, clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ?? obj = new Object();
        obj.f12601a = clone;
        obj.f12602b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(obj);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [u.T, java.lang.Object, u.e] */
    public static C2052e b() {
        C2052e c2052e;
        ThreadLocal threadLocal = f12604b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2052e = (C2052e) weakReference.get()) != null) {
            return c2052e;
        }
        ?? t5 = new T(0);
        threadLocal.set(new WeakReference(t5));
        return t5;
    }

    public static void c(ViewGroup viewGroup, u uVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((u) it.next()).z(viewGroup);
            }
        }
        if (uVar != null) {
            uVar.i(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
