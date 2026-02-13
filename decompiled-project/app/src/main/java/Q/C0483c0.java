package Q;

import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0696w;
import a0.AbstractC0697x;
import a0.C0677d;
import a0.InterfaceC0689p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Q.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483c0 extends AbstractC0696w implements Parcelable, InterfaceC0689p, W, R0 {
    public static final Parcelable.Creator<C0483c0> CREATOR = new Z(2);

    /* renamed from: b, reason: collision with root package name */
    public F0 f8378b;

    public C0483c0(long j) {
        AbstractC0682i k = AbstractC0688o.k();
        F0 f02 = new F0(k.g(), j);
        if (!(k instanceof C0677d)) {
            f02.f12436b = new F0(1, j);
        }
        this.f8378b = f02;
    }

    @Override // a0.InterfaceC0689p
    public final H0 a() {
        return S.f8368f;
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x b() {
        return this.f8378b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(long j) {
        AbstractC0682i k;
        F0 f02 = (F0) AbstractC0688o.i(this.f8378b);
        if (f02.f8302c != j) {
            F0 f03 = this.f8378b;
            synchronized (AbstractC0688o.f12405b) {
                k = AbstractC0688o.k();
                ((F0) AbstractC0688o.o(f03, this, k, f02)).f8302c = j;
            }
            AbstractC0688o.n(k, this);
        }
    }

    @Override // Q.R0
    public Object getValue() {
        return Long.valueOf(((F0) AbstractC0688o.t(this.f8378b, this)).f8302c);
    }

    @Override // Q.W
    public void setValue(Object obj) {
        e(((Number) obj).longValue());
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x t(AbstractC0697x abstractC0697x, AbstractC0697x abstractC0697x2, AbstractC0697x abstractC0697x3) {
        if (((F0) abstractC0697x2).f8302c == ((F0) abstractC0697x3).f8302c) {
            return abstractC0697x2;
        }
        return null;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((F0) AbstractC0688o.i(this.f8378b)).f8302c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(((F0) AbstractC0688o.t(this.f8378b, this)).f8302c);
    }

    @Override // a0.InterfaceC0695v
    public final void z(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f8378b = (F0) abstractC0697x;
    }
}
