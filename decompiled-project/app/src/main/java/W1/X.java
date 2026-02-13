package W1;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X extends l2.Y {
    public static final W g = new W(0);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10390d;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10387a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10388b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10389c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f10391e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10392f = false;

    public X(boolean z8) {
        this.f10390d = z8;
    }

    public final void a(C c10, boolean z8) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + c10);
        }
        c(c10.f10293f, z8);
    }

    public final void b(String str, boolean z8) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        c(str, z8);
    }

    public final void c(String str, boolean z8) {
        HashMap hashMap = this.f10388b;
        X x2 = (X) hashMap.get(str);
        if (x2 != null) {
            if (z8) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(x2.f10388b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x2.b((String) it.next(), true);
                }
            }
            x2.onCleared();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f10389c;
        l2.d0 d0Var = (l2.d0) hashMap2.get(str);
        if (d0Var != null) {
            d0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void d(C c10) {
        if (this.f10392f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f10387a.remove(c10.f10293f) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + c10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x2 = (X) obj;
        return this.f10387a.equals(x2.f10387a) && this.f10388b.equals(x2.f10388b) && this.f10389c.equals(x2.f10389c);
    }

    public final int hashCode() {
        return this.f10389c.hashCode() + ((this.f10388b.hashCode() + (this.f10387a.hashCode() * 31)) * 31);
    }

    @Override // l2.Y
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f10391e = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f10387a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f10388b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f10389c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
