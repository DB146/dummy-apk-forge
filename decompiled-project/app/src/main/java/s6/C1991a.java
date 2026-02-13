package s6;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991a extends H1.b {
    public static final Parcelable.Creator<C1991a> CREATOR = new y(9);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24099c;

    public C1991a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f24099c = parcel.readInt() == 1;
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f24099c ? 1 : 0);
    }
}
