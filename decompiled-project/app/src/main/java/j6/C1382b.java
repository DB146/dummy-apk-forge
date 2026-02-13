package j6;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382b extends H1.b {
    public static final Parcelable.Creator<C1382b> CREATOR = new y(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f18647c;

    public C1382b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1382b.class.getClassLoader();
        }
        this.f18647c = parcel.readInt() == 1;
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f18647c ? 1 : 0);
    }
}
