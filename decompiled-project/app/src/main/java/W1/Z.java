package W1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z implements Parcelable {
    public static final Parcelable.Creator<Z> CREATOR = new U5.a0(18);

    /* renamed from: A, reason: collision with root package name */
    public final int f10393A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10394B;

    /* renamed from: a, reason: collision with root package name */
    public final String f10395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10396b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10397c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10398d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10399e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10400f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f10401u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f10402v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10403w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10404x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10405y;

    /* renamed from: z, reason: collision with root package name */
    public final String f10406z;

    public Z(C c10) {
        this.f10395a = c10.getClass().getName();
        this.f10396b = c10.f10293f;
        this.f10397c = c10.f10260C;
        this.f10398d = c10.L;
        this.f10399e = c10.f10269M;
        this.f10400f = c10.f10270N;
        this.f10401u = c10.f10273Q;
        this.f10402v = c10.f10258A;
        this.f10403w = c10.f10272P;
        this.f10404x = c10.f10271O;
        this.f10405y = c10.f10286b0.ordinal();
        this.f10406z = c10.f10302w;
        this.f10393A = c10.f10303x;
        this.f10394B = c10.f10279W;
    }

    public Z(Parcel parcel) {
        this.f10395a = parcel.readString();
        this.f10396b = parcel.readString();
        this.f10397c = parcel.readInt() != 0;
        this.f10398d = parcel.readInt();
        this.f10399e = parcel.readInt();
        this.f10400f = parcel.readString();
        this.f10401u = parcel.readInt() != 0;
        this.f10402v = parcel.readInt() != 0;
        this.f10403w = parcel.readInt() != 0;
        this.f10404x = parcel.readInt() != 0;
        this.f10405y = parcel.readInt();
        this.f10406z = parcel.readString();
        this.f10393A = parcel.readInt();
        this.f10394B = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f10395a);
        sb2.append(" (");
        sb2.append(this.f10396b);
        sb2.append(")}:");
        if (this.f10397c) {
            sb2.append(" fromLayout");
        }
        int i7 = this.f10399e;
        if (i7 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i7));
        }
        String str = this.f10400f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f10401u) {
            sb2.append(" retainInstance");
        }
        if (this.f10402v) {
            sb2.append(" removing");
        }
        if (this.f10403w) {
            sb2.append(" detached");
        }
        if (this.f10404x) {
            sb2.append(" hidden");
        }
        String str2 = this.f10406z;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f10393A);
        }
        if (this.f10394B) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10395a);
        parcel.writeString(this.f10396b);
        parcel.writeInt(this.f10397c ? 1 : 0);
        parcel.writeInt(this.f10398d);
        parcel.writeInt(this.f10399e);
        parcel.writeString(this.f10400f);
        parcel.writeInt(this.f10401u ? 1 : 0);
        parcel.writeInt(this.f10402v ? 1 : 0);
        parcel.writeInt(this.f10403w ? 1 : 0);
        parcel.writeInt(this.f10404x ? 1 : 0);
        parcel.writeInt(this.f10405y);
        parcel.writeString(this.f10406z);
        parcel.writeInt(this.f10393A);
        parcel.writeInt(this.f10394B ? 1 : 0);
    }
}
