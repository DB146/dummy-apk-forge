package Y0;

import A0.t0;
import B0.AbstractC0167b;
import Q.C0502m;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: N, reason: collision with root package name */
    public final View f11138N;

    /* renamed from: O, reason: collision with root package name */
    public final t0.d f11139O;

    /* renamed from: P, reason: collision with root package name */
    public Z.i f11140P;

    /* renamed from: Q, reason: collision with root package name */
    public Rb.c f11141Q;

    /* renamed from: R, reason: collision with root package name */
    public Rb.c f11142R;

    /* renamed from: S, reason: collision with root package name */
    public Rb.c f11143S;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Context context, Rb.c cVar, C0502m c0502m, Z.j jVar, int i7, t0 t0Var) {
        super(context, c0502m, i7, r7, r10, t0Var);
        View view = (View) cVar.invoke(context);
        t0.d dVar = new t0.d();
        this.f11138N = view;
        this.f11139O = dVar;
        setClipChildren(false);
        String valueOf = String.valueOf(i7);
        Object e2 = jVar != null ? jVar.e(valueOf) : null;
        SparseArray<Parcelable> sparseArray = e2 instanceof SparseArray ? (SparseArray) e2 : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (jVar != null) {
            setSavableRegistryEntry(jVar.a(valueOf, new i(this, 2)));
        }
        b bVar = b.f11071e;
        this.f11141Q = bVar;
        this.f11142R = bVar;
        this.f11143S = bVar;
    }

    public static final void o(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(Z.i iVar) {
        Z.i iVar2 = this.f11140P;
        if (iVar2 != null) {
            ((Q7.h) iVar2).X();
        }
        this.f11140P = iVar;
    }

    public final t0.d getDispatcher() {
        return this.f11139O;
    }

    public final Rb.c getReleaseBlock() {
        return this.f11143S;
    }

    public final Rb.c getResetBlock() {
        return this.f11142R;
    }

    public /* bridge */ /* synthetic */ AbstractC0167b getSubCompositionView() {
        return null;
    }

    public final Rb.c getUpdateBlock() {
        return this.f11141Q;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Rb.c cVar) {
        this.f11143S = cVar;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(Rb.c cVar) {
        this.f11142R = cVar;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(Rb.c cVar) {
        this.f11141Q = cVar;
        setUpdate(new i(this, 5));
    }
}
