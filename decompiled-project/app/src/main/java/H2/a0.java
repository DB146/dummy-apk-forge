package H2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4637a;

    public a0(RecyclerView recyclerView) {
        this.f4637a = recyclerView;
    }

    @Override // H2.L
    public final void a() {
        RecyclerView recyclerView = this.f4637a;
        recyclerView.k(null);
        recyclerView.f13676v0.f4669f = true;
        recyclerView.Z(true);
        if (recyclerView.f13655e.j()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // H2.L
    public final void b(Object obj, int i7, int i10) {
        RecyclerView recyclerView = this.f4637a;
        recyclerView.k(null);
        C0288b c0288b = recyclerView.f13655e;
        if (i10 < 1) {
            c0288b.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        arrayList.add(c0288b.m(obj, 4, i7, i10));
        c0288b.f4638a |= 4;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // H2.L
    public final void c(int i7, int i10) {
        RecyclerView recyclerView = this.f4637a;
        recyclerView.k(null);
        C0288b c0288b = recyclerView.f13655e;
        if (i10 < 1) {
            c0288b.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        arrayList.add(c0288b.m(null, 1, i7, i10));
        c0288b.f4638a |= 1;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // H2.L
    public final void d(int i7, int i10) {
        RecyclerView recyclerView = this.f4637a;
        recyclerView.k(null);
        C0288b c0288b = recyclerView.f13655e;
        c0288b.getClass();
        if (i7 == i10) {
            return;
        }
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        arrayList.add(c0288b.m(null, 8, i7, i10));
        c0288b.f4638a |= 8;
        if (arrayList.size() == 1) {
            f();
        }
    }

    @Override // H2.L
    public final void e(int i7, int i10) {
        RecyclerView recyclerView = this.f4637a;
        recyclerView.k(null);
        C0288b c0288b = recyclerView.f13655e;
        if (i10 < 1) {
            c0288b.getClass();
            return;
        }
        ArrayList arrayList = (ArrayList) c0288b.f4640c;
        arrayList.add(c0288b.m(null, 2, i7, i10));
        c0288b.f4638a |= 2;
        if (arrayList.size() == 1) {
            f();
        }
    }

    public final void f() {
        boolean z8 = RecyclerView.f13607T0;
        RecyclerView recyclerView = this.f4637a;
        if (z8 && recyclerView.f13627I && recyclerView.f13625H) {
            WeakHashMap weakHashMap = y1.K.f26642a;
            recyclerView.postOnAnimation(recyclerView.f13677w);
        } else {
            recyclerView.f13639P = true;
            recyclerView.requestLayout();
        }
    }
}
