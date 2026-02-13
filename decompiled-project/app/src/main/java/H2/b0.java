package H2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 extends H1.b {
    public static final Parcelable.Creator<b0> CREATOR = new C6.y(2);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f4644c;

    public b0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4644c = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.a.class.getClassLoader() : classLoader);
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f4644c, 0);
    }
}
