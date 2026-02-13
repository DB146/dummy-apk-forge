package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import java.util.ArrayList;
import n7.E;
import n7.F;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22059a;

    public /* synthetic */ C1812b(int i7) {
        this.f22059a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o7.e] */
    /* JADX WARN: Type inference failed for: r1v2, types: [o7.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o7.A, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f22059a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                boolean z8 = false;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 2:
                            str2 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 3:
                            str5 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 4:
                            str4 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 5:
                            str3 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 6:
                            str6 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        case 7:
                            z8 = com.bumptech.glide.c.M(readInt, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            str7 = com.bumptech.glide.c.r(readInt, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new C1813c(str, str2, str3, str4, str5, str6, z8, str7);
            case 1:
                int d03 = com.bumptech.glide.c.d0(parcel);
                zzahn zzahnVar = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str10 = null;
                Boolean bool = null;
                C1816f c1816f = null;
                F f4 = null;
                m mVar = null;
                ArrayList arrayList3 = null;
                boolean z10 = false;
                C1813c c1813c = null;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = arrayList3;
                    switch ((char) readInt2) {
                        case 1:
                            zzahnVar = (zzahn) com.bumptech.glide.c.q(parcel, readInt2, zzahn.CREATOR);
                            break;
                        case 2:
                            c1813c = (C1813c) com.bumptech.glide.c.q(parcel, readInt2, C1813c.CREATOR);
                            break;
                        case 3:
                            str8 = com.bumptech.glide.c.r(readInt2, parcel);
                            break;
                        case 4:
                            str9 = com.bumptech.glide.c.r(readInt2, parcel);
                            break;
                        case 5:
                            arrayList = com.bumptech.glide.c.v(parcel, readInt2, C1813c.CREATOR);
                            break;
                        case 6:
                            arrayList2 = com.bumptech.glide.c.t(readInt2, parcel);
                            break;
                        case 7:
                            str10 = com.bumptech.glide.c.r(readInt2, parcel);
                            break;
                        case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                            bool = com.bumptech.glide.c.N(readInt2, parcel);
                            break;
                        case '\t':
                            c1816f = (C1816f) com.bumptech.glide.c.q(parcel, readInt2, C1816f.CREATOR);
                            break;
                        case '\n':
                            z10 = com.bumptech.glide.c.M(readInt2, parcel);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            f4 = (F) com.bumptech.glide.c.q(parcel, readInt2, F.CREATOR);
                            break;
                        case '\f':
                            mVar = (m) com.bumptech.glide.c.q(parcel, readInt2, m.CREATOR);
                            break;
                        case '\r':
                            arrayList3 = com.bumptech.glide.c.v(parcel, readInt2, E.CREATOR);
                            continue;
                        default:
                            com.bumptech.glide.c.b0(readInt2, parcel);
                            break;
                    }
                    arrayList3 = arrayList4;
                }
                com.bumptech.glide.c.y(d03, parcel);
                ?? obj = new Object();
                obj.f22069a = zzahnVar;
                obj.f22070b = c1813c;
                obj.f22071c = str8;
                obj.f22072d = str9;
                obj.f22073e = arrayList;
                obj.f22074f = arrayList2;
                obj.f22075u = str10;
                obj.f22076v = bool;
                obj.f22077w = c1816f;
                obj.f22078x = z10;
                obj.f22079y = f4;
                obj.f22080z = mVar;
                obj.f22068A = arrayList3;
                return obj;
            case 2:
                int d04 = com.bumptech.glide.c.d0(parcel);
                long j = 0;
                long j10 = 0;
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        j = com.bumptech.glide.c.S(readInt3, parcel);
                    } else if (c10 != 2) {
                        com.bumptech.glide.c.b0(readInt3, parcel);
                    } else {
                        j10 = com.bumptech.glide.c.S(readInt3, parcel);
                    }
                }
                com.bumptech.glide.c.y(d04, parcel);
                return new C1816f(j, j10);
            case 3:
                int d05 = com.bumptech.glide.c.d0(parcel);
                String str11 = null;
                String str12 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                C1815e c1815e = null;
                while (parcel.dataPosition() < d05) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        str11 = com.bumptech.glide.c.r(readInt4, parcel);
                    } else if (c11 == 2) {
                        str12 = com.bumptech.glide.c.r(readInt4, parcel);
                    } else if (c11 == 3) {
                        arrayList5 = com.bumptech.glide.c.v(parcel, readInt4, n7.v.CREATOR);
                    } else if (c11 == 4) {
                        arrayList6 = com.bumptech.glide.c.v(parcel, readInt4, n7.y.CREATOR);
                    } else if (c11 != 5) {
                        com.bumptech.glide.c.b0(readInt4, parcel);
                    } else {
                        c1815e = (C1815e) com.bumptech.glide.c.q(parcel, readInt4, C1815e.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d05, parcel);
                ?? obj2 = new Object();
                obj2.f22083a = str11;
                obj2.f22084b = str12;
                obj2.f22085c = arrayList5;
                obj2.f22086d = arrayList6;
                obj2.f22087e = c1815e;
                return obj2;
            case 4:
                int d06 = com.bumptech.glide.c.d0(parcel);
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                while (parcel.dataPosition() < d06) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        arrayList7 = com.bumptech.glide.c.v(parcel, readInt5, n7.v.CREATOR);
                    } else if (c12 != 2) {
                        com.bumptech.glide.c.b0(readInt5, parcel);
                    } else {
                        arrayList8 = com.bumptech.glide.c.v(parcel, readInt5, n7.y.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d06, parcel);
                return new m(arrayList7, arrayList8);
            case 5:
                int d07 = com.bumptech.glide.c.d0(parcel);
                String str13 = null;
                boolean z11 = false;
                String str14 = null;
                while (parcel.dataPosition() < d07) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 == 1) {
                        str13 = com.bumptech.glide.c.r(readInt6, parcel);
                    } else if (c13 == 2) {
                        str14 = com.bumptech.glide.c.r(readInt6, parcel);
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.b0(readInt6, parcel);
                    } else {
                        z11 = com.bumptech.glide.c.M(readInt6, parcel);
                    }
                }
                com.bumptech.glide.c.y(d07, parcel);
                return new z(str13, str14, z11);
            default:
                int d08 = com.bumptech.glide.c.d0(parcel);
                C1815e c1815e2 = null;
                z zVar = null;
                F f10 = null;
                while (parcel.dataPosition() < d08) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 == 1) {
                        c1815e2 = (C1815e) com.bumptech.glide.c.q(parcel, readInt7, C1815e.CREATOR);
                    } else if (c14 == 2) {
                        zVar = (z) com.bumptech.glide.c.q(parcel, readInt7, z.CREATOR);
                    } else if (c14 != 3) {
                        com.bumptech.glide.c.b0(readInt7, parcel);
                    } else {
                        f10 = (F) com.bumptech.glide.c.q(parcel, readInt7, F.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d08, parcel);
                ?? obj3 = new Object();
                obj3.f22056a = c1815e2;
                obj3.f22057b = zVar;
                obj3.f22058c = f10;
                return obj3;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f22059a) {
            case 0:
                return new C1813c[i7];
            case 1:
                return new C1815e[i7];
            case 2:
                return new C1816f[i7];
            case 3:
                return new C1817g[i7];
            case 4:
                return new m[i7];
            case 5:
                return new z[i7];
            default:
                return new C1810A[i7];
        }
    }
}
