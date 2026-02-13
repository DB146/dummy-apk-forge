package C6;

import H2.b0;
import W1.B;
import android.os.Parcel;
import android.os.Parcelable;
import e3.C1083h;
import j6.C1382b;
import o.S0;
import s6.C1991a;
import z6.C2600c;

/* loaded from: classes.dex */
public final class y implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3035a;

    public /* synthetic */ y(int i7) {
        this.f3035a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3035a) {
            case 0:
                return new z(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return H1.b.f4567b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new b0(parcel, null);
            case 3:
                return new B(parcel, null);
            case 4:
                return new C1083h(parcel, null);
            case 5:
                return new i1.g(parcel, null);
            case 6:
                return new i6.e(parcel, (ClassLoader) null);
            case 7:
                return new C1382b(parcel, null);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new S0(parcel, null);
            case 9:
                return new C1991a(parcel, null);
            default:
                return new C2600c(parcel, (ClassLoader) null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f3035a) {
            case 0:
                return new z(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return H1.b.f4567b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new b0(parcel, classLoader);
            case 3:
                return new B(parcel, classLoader);
            case 4:
                return new C1083h(parcel, classLoader);
            case 5:
                return new i1.g(parcel, classLoader);
            case 6:
                return new i6.e(parcel, classLoader);
            case 7:
                return new C1382b(parcel, classLoader);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new S0(parcel, classLoader);
            case 9:
                return new C1991a(parcel, classLoader);
            default:
                return new C2600c(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f3035a) {
            case 0:
                return new z[i7];
            case 1:
                return new H1.b[i7];
            case 2:
                return new b0[i7];
            case 3:
                return new B[i7];
            case 4:
                return new C1083h[i7];
            case 5:
                return new i1.g[i7];
            case 6:
                return new i6.e[i7];
            case 7:
                return new C1382b[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new S0[i7];
            case 9:
                return new C1991a[i7];
            default:
                return new C2600c[i7];
        }
    }
}
