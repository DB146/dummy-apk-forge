package m7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1636b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20755a;

    public /* synthetic */ C1636b(int i7) {
        this.f20755a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20755a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                int i7 = 0;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        com.bumptech.glide.c.b0(readInt, parcel);
                    } else {
                        i7 = com.bumptech.glide.c.Q(readInt, parcel);
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new C1635a(i7);
            case 1:
                int d03 = com.bumptech.glide.c.d0(parcel);
                boolean z8 = false;
                int i10 = 0;
                String str = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        z8 = com.bumptech.glide.c.M(readInt2, parcel);
                    } else if (c10 == 2) {
                        i10 = com.bumptech.glide.c.Q(readInt2, parcel);
                    } else if (c10 == 3) {
                        str = com.bumptech.glide.c.r(readInt2, parcel);
                    } else if (c10 == 4) {
                        bundle = com.bumptech.glide.c.k(readInt2, parcel);
                    } else if (c10 != 5) {
                        com.bumptech.glide.c.b0(readInt2, parcel);
                    } else {
                        bundle2 = com.bumptech.glide.c.k(readInt2, parcel);
                    }
                }
                com.bumptech.glide.c.y(d03, parcel);
                return new h(z8, i10, str, bundle, bundle2);
            case 2:
                int d04 = com.bumptech.glide.c.d0(parcel);
                int i11 = 0;
                Thing[] thingArr = null;
                String[] strArr = null;
                String[] strArr2 = null;
                zzk zzkVar = null;
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = com.bumptech.glide.c.Q(readInt3, parcel);
                            break;
                        case 2:
                            thingArr = (Thing[]) com.bumptech.glide.c.u(parcel, readInt3, Thing.CREATOR);
                            break;
                        case 3:
                            strArr = com.bumptech.glide.c.s(readInt3, parcel);
                            break;
                        case 4:
                        default:
                            com.bumptech.glide.c.b0(readInt3, parcel);
                            break;
                        case 5:
                            strArr2 = com.bumptech.glide.c.s(readInt3, parcel);
                            break;
                        case 6:
                            zzkVar = (zzk) com.bumptech.glide.c.q(parcel, readInt3, zzk.CREATOR);
                            break;
                        case 7:
                            str2 = com.bumptech.glide.c.r(readInt3, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            str3 = com.bumptech.glide.c.r(readInt3, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d04, parcel);
                return new f(i11, thingArr, strArr, strArr2, zzkVar, str2, str3);
            default:
                int d05 = com.bumptech.glide.c.d0(parcel);
                int i12 = 0;
                Bundle bundle3 = null;
                h hVar = null;
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < d05) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        bundle3 = com.bumptech.glide.c.k(readInt4, parcel);
                    } else if (c11 == 2) {
                        hVar = (h) com.bumptech.glide.c.q(parcel, readInt4, h.CREATOR);
                    } else if (c11 == 3) {
                        str4 = com.bumptech.glide.c.r(readInt4, parcel);
                    } else if (c11 == 4) {
                        str5 = com.bumptech.glide.c.r(readInt4, parcel);
                    } else if (c11 != 1000) {
                        com.bumptech.glide.c.b0(readInt4, parcel);
                    } else {
                        i12 = com.bumptech.glide.c.Q(readInt4, parcel);
                    }
                }
                com.bumptech.glide.c.y(d05, parcel);
                return new Thing(i12, bundle3, hVar, str4, str5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f20755a) {
            case 0:
                return new C1635a[i7];
            case 1:
                return new h[i7];
            case 2:
                return new f[i7];
            default:
                return new Thing[i7];
        }
    }
}
