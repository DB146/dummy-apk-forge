package W1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new C6.y(3);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f10256a;

    public B(Bundle bundle) {
        this.f10256a = bundle;
    }

    public B(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f10256a = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f10256a);
    }
}
