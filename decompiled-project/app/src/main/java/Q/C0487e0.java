package Q;

import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0696w;
import a0.AbstractC0697x;
import a0.C0677d;
import a0.InterfaceC0689p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Q.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487e0 extends AbstractC0696w implements Parcelable, InterfaceC0689p {
    public static final Parcelable.Creator<C0487e0> CREATOR = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final H0 f8387b;

    /* renamed from: c, reason: collision with root package name */
    public G0 f8388c;

    public C0487e0(Object obj, H0 h02) {
        this.f8387b = h02;
        AbstractC0682i k = AbstractC0688o.k();
        G0 g02 = new G0(obj, k.g());
        if (!(k instanceof C0677d)) {
            g02.f12436b = new G0(obj, 1);
        }
        this.f8388c = g02;
    }

    @Override // a0.InterfaceC0689p
    public final H0 a() {
        return this.f8387b;
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x b() {
        return this.f8388c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Q.R0
    public final Object getValue() {
        return ((G0) AbstractC0688o.t(this.f8388c, this)).f8304c;
    }

    @Override // Q.W
    public final void setValue(Object obj) {
        AbstractC0682i k;
        G0 g02 = (G0) AbstractC0688o.i(this.f8388c);
        if (this.f8387b.a(g02.f8304c, obj)) {
            return;
        }
        G0 g03 = this.f8388c;
        synchronized (AbstractC0688o.f12405b) {
            k = AbstractC0688o.k();
            ((G0) AbstractC0688o.o(g03, this, k, g02)).f8304c = obj;
        }
        AbstractC0688o.n(k, this);
    }

    @Override // a0.InterfaceC0695v
    public final AbstractC0697x t(AbstractC0697x abstractC0697x, AbstractC0697x abstractC0697x2, AbstractC0697x abstractC0697x3) {
        if (this.f8387b.a(((G0) abstractC0697x2).f8304c, ((G0) abstractC0697x3).f8304c)) {
            return abstractC0697x2;
        }
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((G0) AbstractC0688o.i(this.f8388c)).f8304c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10;
        parcel.writeValue(getValue());
        S s3 = S.f8365c;
        H0 h02 = this.f8387b;
        if (kotlin.jvm.internal.l.a(h02, s3)) {
            i10 = 0;
        } else if (kotlin.jvm.internal.l.a(h02, S.f8368f)) {
            i10 = 1;
        } else {
            if (!kotlin.jvm.internal.l.a(h02, S.f8366d)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }

    @Override // a0.InterfaceC0695v
    public final void z(AbstractC0697x abstractC0697x) {
        kotlin.jvm.internal.l.c(abstractC0697x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f8388c = (G0) abstractC0697x;
    }
}
