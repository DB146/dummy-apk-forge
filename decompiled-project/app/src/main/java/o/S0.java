package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class S0 extends H1.b {
    public static final Parcelable.Creator<S0> CREATOR = new C6.y(8);

    /* renamed from: c, reason: collision with root package name */
    public int f21431c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21432d;

    public S0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21431c = parcel.readInt();
        this.f21432d = parcel.readInt() != 0;
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f21431c);
        parcel.writeInt(this.f21432d ? 1 : 0);
    }
}
