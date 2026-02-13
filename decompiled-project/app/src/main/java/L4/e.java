package L4;

import K4.l;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements F4.b {
    public static final Parcelable.Creator<e> CREATOR = new l(14);

    /* renamed from: a, reason: collision with root package name */
    public final float f6301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6302b;

    public e(int i7, float f4) {
        this.f6301a = f4;
        this.f6302b = i7;
    }

    public e(Parcel parcel) {
        this.f6301a = parcel.readFloat();
        this.f6302b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6301a == eVar.f6301a && this.f6302b == eVar.f6302b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f6301a).hashCode() + 527) * 31) + this.f6302b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f6301a + ", svcTemporalLayerCount=" + this.f6302b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f6301a);
        parcel.writeInt(this.f6302b);
    }
}
