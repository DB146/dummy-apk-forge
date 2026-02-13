package androidx.databinding;

import J1.c;
import J1.k;
import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends c {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f13317a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13318b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f13319c = new CopyOnWriteArrayList();

    @Override // J1.c
    public final k b(View view, int i7) {
        Iterator it = this.f13318b.iterator();
        while (it.hasNext()) {
            k b2 = ((c) it.next()).b(view, i7);
            if (b2 != null) {
                return b2;
            }
        }
        if (f()) {
            return b(view, i7);
        }
        return null;
    }

    @Override // J1.c
    public final k c(View[] viewArr, int i7) {
        Iterator it = this.f13318b.iterator();
        while (it.hasNext()) {
            k c10 = ((c) it.next()).c(viewArr, i7);
            if (c10 != null) {
                return c10;
            }
        }
        if (f()) {
            return c(viewArr, i7);
        }
        return null;
    }

    @Override // J1.c
    public final int d(String str) {
        Iterator it = this.f13318b.iterator();
        while (it.hasNext()) {
            int d10 = ((c) it.next()).d(str);
            if (d10 != 0) {
                return d10;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public final void e(c cVar) {
        if (this.f13317a.add(cVar.getClass())) {
            this.f13318b.add(cVar);
            Iterator it = cVar.a().iterator();
            while (it.hasNext()) {
                e((c) it.next());
            }
        }
    }

    public final boolean f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13319c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (c.class.isAssignableFrom(cls)) {
                    e((c) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z8 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            } catch (InstantiationException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            }
        }
        return z8;
    }
}
