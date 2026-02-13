package Q;

import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0696w;
import a0.AbstractC0697x;
import a0.C0677d;
import a0.InterfaceC0689p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Q.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479a0 extends AbstractC0696w implements Parcelable, InterfaceC0689p, W, R0 {
    public static final Parcelable.Creator<C0479a0> CREATOR = new Z(0);

    /* renamed from: b, reason: collision with root package name */
    public D0 f8374b;

    public C0479a0(float f4) {
        AbstractC0682i k = AbstractC0688o.k();
        D0 d02 = new D0(k.g(), f4);
        if (!(k instanceof C0677d)) {
            d02.f12436b = new D0(1, f4);
        }
        this.f8374b = d02;
    }

    @Override // a0.InterfaceC0689p
    public final H0 a() {
        return S.f8368f;
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x b() {
        return this.f8374b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return ((D0) AbstractC0688o.t(this.f8374b, this)).f8300c;
    }

    public final void f(float f4) {
        AbstractC0682i k;
        D0 d02 = (D0) AbstractC0688o.i(this.f8374b);
        if (d02.f8300c == f4) {
            return;
        }
        D0 d03 = this.f8374b;
        synchronized (AbstractC0688o.f12405b) {
            k = AbstractC0688o.k();
            ((D0) AbstractC0688o.o(d03, this, k, d02)).f8300c = f4;
        }
        AbstractC0688o.n(k, this);
    }

    @Override // Q.R0
    public Object getValue() {
        return Float.valueOf(e());
    }

    @Override // Q.W
    public void setValue(Object obj) {
        f(((Number) obj).floatValue());
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x t(AbstractC0697x abstractC0697x, AbstractC0697x abstractC0697x2, AbstractC0697x abstractC0697x3) {
        if (((D0) abstractC0697x2).f8300c == ((D0) abstractC0697x3).f8300c) {
            return abstractC0697x2;
        }
        return null;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((D0) AbstractC0688o.i(this.f8374b)).f8300c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(e());
    }

    @Override // a0.InterfaceC0695v
    public final void z(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f8374b = (D0) abstractC0697x;
    }
}
