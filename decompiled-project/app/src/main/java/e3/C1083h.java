package e3;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083h extends H1.b {
    public static final Parcelable.Creator<C1083h> CREATOR = new y(4);

    /* renamed from: c, reason: collision with root package name */
    public int f16723c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f16724d;

    /* renamed from: e, reason: collision with root package name */
    public final ClassLoader f16725e;

    public C1083h(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C1083h.class.getClassLoader() : classLoader;
        this.f16723c = parcel.readInt();
        this.f16724d = parcel.readParcelable(classLoader);
        this.f16725e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return A3.c.k(sb2, this.f16723c, "}");
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f16723c);
        parcel.writeParcelable(this.f16724d, i7);
    }
}
