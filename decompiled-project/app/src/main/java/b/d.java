package b;

import a6.C0779c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new C0779c(8);

    /* renamed from: a, reason: collision with root package name */
    public b f13767a;

    public void a(int i7, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f13767a == null) {
                    this.f13767a = new c(this);
                }
                parcel.writeStrongBinder(this.f13767a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
