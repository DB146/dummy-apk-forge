package K4;

import N6.H;
import U5.C0534b;
import U5.C0554w;
import U5.EnumC0535c;
import U5.P;
import U5.Q;
import U5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.fido.common.Transport;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.ArrayList;
import y.S;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6145a;

    public /* synthetic */ l(int i7) {
        this.f6145a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6145a) {
            case 0:
                return new m(parcel);
            case 1:
                return new n(parcel);
            case 2:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new o(readString, readString2, H.G(createStringArray));
            case 3:
                return new p(parcel);
            case 4:
                int d02 = com.bumptech.glide.c.d0(parcel);
                String str = null;
                int i7 = 0;
                K5.a aVar = null;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        i7 = com.bumptech.glide.c.Q(readInt, parcel);
                    } else if (c10 == 2) {
                        str = com.bumptech.glide.c.r(readInt, parcel);
                    } else if (c10 != 3) {
                        com.bumptech.glide.c.b0(readInt, parcel);
                    } else {
                        aVar = (K5.a) com.bumptech.glide.c.q(parcel, readInt, K5.a.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new K5.g(aVar, str, i7);
            case 5:
                int d03 = com.bumptech.glide.c.d0(parcel);
                ArrayList arrayList = null;
                int i10 = 0;
                String str2 = null;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i10 = com.bumptech.glide.c.Q(readInt2, parcel);
                    } else if (c11 == 2) {
                        arrayList = com.bumptech.glide.c.v(parcel, readInt2, K5.f.CREATOR);
                    } else if (c11 != 3) {
                        com.bumptech.glide.c.b0(readInt2, parcel);
                    } else {
                        str2 = com.bumptech.glide.c.r(readInt2, parcel);
                    }
                }
                com.bumptech.glide.c.y(d03, parcel);
                return new K5.h(i10, str2, arrayList);
            case 6:
                int d04 = com.bumptech.glide.c.d0(parcel);
                String str3 = null;
                int i11 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i11 = com.bumptech.glide.c.Q(readInt3, parcel);
                    } else if (c12 == 2) {
                        str3 = com.bumptech.glide.c.r(readInt3, parcel);
                    } else if (c12 != 3) {
                        com.bumptech.glide.c.b0(readInt3, parcel);
                    } else {
                        arrayList2 = com.bumptech.glide.c.v(parcel, readInt3, K5.g.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d04, parcel);
                return new K5.f(i11, str3, arrayList2);
            case 7:
                int d05 = com.bumptech.glide.c.d0(parcel);
                int i12 = 0;
                Parcel parcel2 = null;
                K5.h hVar = null;
                while (parcel.dataPosition() < d05) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 1) {
                        i12 = com.bumptech.glide.c.Q(readInt4, parcel);
                    } else if (c13 == 2) {
                        int U8 = com.bumptech.glide.c.U(readInt4, parcel);
                        int dataPosition = parcel.dataPosition();
                        if (U8 == 0) {
                            parcel2 = null;
                        } else {
                            Parcel obtain = Parcel.obtain();
                            obtain.appendFrom(parcel, dataPosition, U8);
                            parcel.setDataPosition(dataPosition + U8);
                            parcel2 = obtain;
                        }
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.b0(readInt4, parcel);
                    } else {
                        hVar = (K5.h) com.bumptech.glide.c.q(parcel, readInt4, K5.h.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d05, parcel);
                return new K5.d(i12, parcel2, hVar);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new K6.b(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                return new K6.c(parcel.readArrayList(K6.c.class.getClassLoader()));
            case 10:
                return new L4.a(parcel);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new L4.b(parcel);
            case 12:
                ArrayList arrayList3 = new ArrayList();
                parcel.readList(arrayList3, L4.c.class.getClassLoader());
                return new L4.d(arrayList3);
            case 13:
                return new L4.c(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 14:
                return new L4.e(parcel);
            case 15:
                return new M4.a(parcel);
            case 16:
                return new M4.e(parcel);
            case 17:
                return new Object();
            case 18:
                return new M4.i(parcel);
            case 19:
                return new M4.j(parcel.readLong(), parcel.readLong());
            case 20:
                return new I4.b(parcel);
            case 21:
                kotlin.jvm.internal.l.e(parcel, "parcel");
                return new N9.b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                kotlin.jvm.internal.l.e(parcel, "parcel");
                return new N9.a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                return new O4.b(parcel);
            case 24:
                String readString3 = parcel.readString();
                try {
                    for (Transport transport : Transport.values()) {
                        if (readString3.equals(transport.f15134a)) {
                            return transport;
                        }
                    }
                    if (readString3.equals("hybrid")) {
                        return Transport.HYBRID;
                    }
                    throw new Exception(S.b("Transport ", readString3, " not supported"));
                } catch (S5.a e2) {
                    throw new RuntimeException(e2);
                }
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                try {
                    return EnumC0535c.a(parcel.readString());
                } catch (C0534b e10) {
                    throw new RuntimeException(e10);
                }
            case 26:
                int d06 = com.bumptech.glide.c.d0(parcel);
                boolean z8 = false;
                while (parcel.dataPosition() < d06) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        com.bumptech.glide.c.b0(readInt5, parcel);
                    } else {
                        z8 = com.bumptech.glide.c.M(readInt5, parcel);
                    }
                }
                com.bumptech.glide.c.y(d06, parcel);
                return new d0(z8);
            case 27:
                int d07 = com.bumptech.glide.c.d0(parcel);
                long j = 0;
                while (parcel.dataPosition() < d07) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        com.bumptech.glide.c.b0(readInt6, parcel);
                    } else {
                        j = com.bumptech.glide.c.S(readInt6, parcel);
                    }
                }
                com.bumptech.glide.c.y(d07, parcel);
                return new P(j);
            case 28:
                int d08 = com.bumptech.glide.c.d0(parcel);
                boolean z10 = false;
                while (parcel.dataPosition() < d08) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        com.bumptech.glide.c.b0(readInt7, parcel);
                    } else {
                        z10 = com.bumptech.glide.c.M(readInt7, parcel);
                    }
                }
                com.bumptech.glide.c.y(d08, parcel);
                return new Q(z10);
            default:
                int d09 = com.bumptech.glide.c.d0(parcel);
                boolean z11 = false;
                while (parcel.dataPosition() < d09) {
                    int readInt8 = parcel.readInt();
                    if (((char) readInt8) != 1) {
                        com.bumptech.glide.c.b0(readInt8, parcel);
                    } else {
                        z11 = com.bumptech.glide.c.M(readInt8, parcel);
                    }
                }
                com.bumptech.glide.c.y(d09, parcel);
                return new C0554w(z11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f6145a) {
            case 0:
                return new m[i7];
            case 1:
                return new n[i7];
            case 2:
                return new o[i7];
            case 3:
                return new p[i7];
            case 4:
                return new K5.g[i7];
            case 5:
                return new K5.h[i7];
            case 6:
                return new K5.f[i7];
            case 7:
                return new K5.d[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new K6.b[i7];
            case 9:
                return new K6.c[i7];
            case 10:
                return new L4.a[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new L4.b[i7];
            case 12:
                return new L4.d[i7];
            case 13:
                return new L4.c[i7];
            case 14:
                return new L4.e[i7];
            case 15:
                return new M4.a[i7];
            case 16:
                return new M4.e[i7];
            case 17:
                return new M4.f[i7];
            case 18:
                return new M4.i[i7];
            case 19:
                return new M4.j[i7];
            case 20:
                return new N4.a[i7];
            case 21:
                return new N9.b[i7];
            case 22:
                return new N9.a[i7];
            case 23:
                return new O4.b[i7];
            case 24:
                return new Transport[i7];
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new EnumC0535c[i7];
            case 26:
                return new d0[i7];
            case 27:
                return new P[i7];
            case 28:
                return new Q[i7];
            default:
                return new C0554w[i7];
        }
    }
}
