package H2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f4706t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f4707a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f4708b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f4721r;

    /* renamed from: s, reason: collision with root package name */
    public K f4722s;

    /* renamed from: c, reason: collision with root package name */
    public int f4709c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4710d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f4711e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f4712f = -1;
    public int g = -1;

    /* renamed from: h, reason: collision with root package name */
    public i0 f4713h = null;

    /* renamed from: i, reason: collision with root package name */
    public i0 f4714i = null;
    public ArrayList k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f4715l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f4716m = 0;

    /* renamed from: n, reason: collision with root package name */
    public Y f4717n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4718o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f4719p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f4720q = -1;

    public i0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f4707a = view;
    }

    public final void a(int i7) {
        this.j = i7 | this.j;
    }

    public final int c() {
        RecyclerView recyclerView = this.f4721r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.J(this);
    }

    public final int d() {
        int i7 = this.g;
        return i7 == -1 ? this.f4709c : i7;
    }

    public final List e() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? f4706t : this.f4715l;
    }

    public final boolean f(int i7) {
        return (i7 & this.j) != 0;
    }

    public final boolean g() {
        View view = this.f4707a;
        return (view.getParent() == null || view.getParent() == this.f4721r) ? false : true;
    }

    public final boolean h() {
        return (this.j & 1) != 0;
    }

    public final boolean i() {
        return (this.j & 4) != 0;
    }

    public final boolean j() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            if (!this.f4707a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return (this.j & 8) != 0;
    }

    public final boolean l() {
        return this.f4717n != null;
    }

    public final boolean m() {
        return (this.j & 256) != 0;
    }

    public final boolean n() {
        return (this.j & 2) != 0;
    }

    public final void o(int i7, boolean z8) {
        if (this.f4710d == -1) {
            this.f4710d = this.f4709c;
        }
        if (this.g == -1) {
            this.g = this.f4709c;
        }
        if (z8) {
            this.g += i7;
        }
        this.f4709c += i7;
        View view = this.f4707a;
        if (view.getLayoutParams() != null) {
            ((T) view.getLayoutParams()).f4617c = true;
        }
    }

    public final void p() {
        if (RecyclerView.f13602O0 && m()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f4709c = -1;
        this.f4710d = -1;
        this.f4711e = -1L;
        this.g = -1;
        this.f4716m = 0;
        this.f4713h = null;
        this.f4714i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f4719p = 0;
        this.f4720q = -1;
        RecyclerView.l(this);
    }

    public final void q(boolean z8) {
        int i7 = this.f4716m;
        int i10 = z8 ? i7 - 1 : i7 + 1;
        this.f4716m = i10;
        if (i10 < 0) {
            this.f4716m = 0;
            if (RecyclerView.f13602O0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z8 && i10 == 1) {
            this.j |= 16;
        } else if (z8 && i10 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.f13603P0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z8 + ":" + this);
        }
    }

    public final boolean r() {
        return (this.j & 128) != 0;
    }

    public final boolean s() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder n6 = A3.c.n(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        n6.append(Integer.toHexString(hashCode()));
        n6.append(" position=");
        n6.append(this.f4709c);
        n6.append(" id=");
        n6.append(this.f4711e);
        n6.append(", oldPos=");
        n6.append(this.f4710d);
        n6.append(", pLpos:");
        n6.append(this.g);
        StringBuilder sb2 = new StringBuilder(n6.toString());
        if (l()) {
            sb2.append(" scrap ");
            sb2.append(this.f4718o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (i()) {
            sb2.append(" invalid");
        }
        if (!h()) {
            sb2.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb2.append(" update");
        }
        if (k()) {
            sb2.append(" removed");
        }
        if (r()) {
            sb2.append(" ignored");
        }
        if (m()) {
            sb2.append(" tmpDetached");
        }
        if (!j()) {
            sb2.append(" not recyclable(" + this.f4716m + ")");
        }
        if ((this.j & 512) != 0 || i()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f4707a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
