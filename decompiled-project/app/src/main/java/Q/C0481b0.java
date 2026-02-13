package Q;

import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0696w;
import a0.AbstractC0697x;
import a0.C0677d;
import a0.InterfaceC0689p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Q.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481b0 extends AbstractC0696w implements Parcelable, InterfaceC0689p, W, R0 {
    public static final Parcelable.Creator<C0481b0> CREATOR = new Z(1);

    /* renamed from: b, reason: collision with root package name */
    public E0 f8377b;

    public C0481b0(int i7) {
        AbstractC0682i k = AbstractC0688o.k();
        E0 e02 = new E0(i7, k.g());
        if (!(k instanceof C0677d)) {
            e02.f12436b = new E0(i7, 1);
        }
        this.f8377b = e02;
    }

    @Override // a0.InterfaceC0689p
    public final H0 a() {
        return S.f8368f;
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x b() {
        return this.f8377b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i7) {
        AbstractC0682i k;
        E0 e02 = (E0) AbstractC0688o.i(this.f8377b);
        if (e02.f8301c != i7) {
            E0 e03 = this.f8377b;
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                ((E0) AbstractC0688o.o(e03, this, k, e02)).f8301c = i7;
            }
            AbstractC0688o.n(k, this);
        }
    }

    @Override // Q.R0
    public Object getValue() {
        return Integer.valueOf(((E0) AbstractC0688o.t(this.f8377b, this)).f8301c);
    }

    @Override // Q.W
    public void setValue(Object obj) {
        e(((Number) obj).intValue());
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x t(AbstractC0697x abstractC0697x, AbstractC0697x abstractC0697x2, AbstractC0697x abstractC0697x3) {
        if (((E0) abstractC0697x2).f8301c == ((E0) abstractC0697x3).f8301c) {
            return abstractC0697x2;
        }
        return null;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((E0) AbstractC0688o.i(this.f8377b)).f8301c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(((E0) AbstractC0688o.t(this.f8377b, this)).f8301c);
    }

    @Override // a0.InterfaceC0695v
    public final void z(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f8377b = (E0) abstractC0697x;
    }
}
