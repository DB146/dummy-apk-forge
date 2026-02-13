package B5;

import C1.h;
import F5.d;
import F5.r;
import F5.s;
import F5.t;
import H2.A;
import H2.o0;
import H2.p0;
import K4.e;
import K4.f;
import K4.k;
import P1.g;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2111a;

    public /* synthetic */ c(int i7) {
        this.f2111a = i7;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, H2.A] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, H2.o0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, H2.p0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$BaseSavedState, C1.h, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2111a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                String str = null;
                byte[] bArr = null;
                Bundle bundle = null;
                long j = 0;
                int i7 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 == 1) {
                        str = com.bumptech.glide.c.r(readInt, parcel);
                    } else if (c10 == 2) {
                        i10 = com.bumptech.glide.c.Q(readInt, parcel);
                    } else if (c10 == 3) {
                        j = com.bumptech.glide.c.S(readInt, parcel);
                    } else if (c10 == 4) {
                        bArr = com.bumptech.glide.c.l(readInt, parcel);
                    } else if (c10 == 5) {
                        bundle = com.bumptech.glide.c.k(readInt, parcel);
                    } else if (c10 != 1000) {
                        com.bumptech.glide.c.b0(readInt, parcel);
                    } else {
                        i7 = com.bumptech.glide.c.Q(readInt, parcel);
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new a(i7, str, i10, j, bArr, bundle);
            case 1:
                int d03 = com.bumptech.glide.c.d0(parcel);
                PendingIntent pendingIntent = null;
                Bundle bundle2 = null;
                byte[] bArr2 = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < d03) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 == 1) {
                        i12 = com.bumptech.glide.c.Q(readInt2, parcel);
                    } else if (c11 == 2) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt2, PendingIntent.CREATOR);
                    } else if (c11 == 3) {
                        i13 = com.bumptech.glide.c.Q(readInt2, parcel);
                    } else if (c11 == 4) {
                        bundle2 = com.bumptech.glide.c.k(readInt2, parcel);
                    } else if (c11 == 5) {
                        bArr2 = com.bumptech.glide.c.l(readInt2, parcel);
                    } else if (c11 != 1000) {
                        com.bumptech.glide.c.b0(readInt2, parcel);
                    } else {
                        i11 = com.bumptech.glide.c.Q(readInt2, parcel);
                    }
                }
                com.bumptech.glide.c.y(d03, parcel);
                return new b(i11, i12, pendingIntent, i13, bundle2, bArr2);
            case 2:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.f2477a = parcel.readInt();
                return baseSavedState;
            case 3:
                int d04 = com.bumptech.glide.c.d0(parcel);
                Bundle bundle3 = null;
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < d04) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 == 1) {
                        i14 = com.bumptech.glide.c.Q(readInt3, parcel);
                    } else if (c12 == 2) {
                        i15 = com.bumptech.glide.c.Q(readInt3, parcel);
                    } else if (c12 != 3) {
                        com.bumptech.glide.c.b0(readInt3, parcel);
                    } else {
                        bundle3 = com.bumptech.glide.c.k(readInt3, parcel);
                    }
                }
                com.bumptech.glide.c.y(d04, parcel);
                return new D5.a(i14, i15, bundle3);
            case 4:
                int d05 = com.bumptech.glide.c.d0(parcel);
                String str2 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < d05) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 == 2) {
                        str2 = com.bumptech.glide.c.r(readInt4, parcel);
                    } else if (c13 != 5) {
                        com.bumptech.glide.c.b0(readInt4, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) com.bumptech.glide.c.q(parcel, readInt4, GoogleSignInOptions.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d05, parcel);
                return new SignInConfiguration(str2, googleSignInOptions);
            case 5:
                int d06 = com.bumptech.glide.c.d0(parcel);
                PendingIntent pendingIntent2 = null;
                int i16 = 0;
                int i17 = 0;
                String str3 = null;
                while (parcel.dataPosition() < d06) {
                    int readInt5 = parcel.readInt();
                    char c14 = (char) readInt5;
                    if (c14 == 1) {
                        i16 = com.bumptech.glide.c.Q(readInt5, parcel);
                    } else if (c14 == 2) {
                        i17 = com.bumptech.glide.c.Q(readInt5, parcel);
                    } else if (c14 == 3) {
                        pendingIntent2 = (PendingIntent) com.bumptech.glide.c.q(parcel, readInt5, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        com.bumptech.glide.c.b0(readInt5, parcel);
                    } else {
                        str3 = com.bumptech.glide.c.r(readInt5, parcel);
                    }
                }
                com.bumptech.glide.c.y(d06, parcel);
                return new F5.b(i16, i17, pendingIntent2, str3);
            case 6:
                int d07 = com.bumptech.glide.c.d0(parcel);
                long j10 = -1;
                int i18 = 0;
                String str4 = null;
                while (parcel.dataPosition() < d07) {
                    int readInt6 = parcel.readInt();
                    char c15 = (char) readInt6;
                    if (c15 == 1) {
                        str4 = com.bumptech.glide.c.r(readInt6, parcel);
                    } else if (c15 == 2) {
                        i18 = com.bumptech.glide.c.Q(readInt6, parcel);
                    } else if (c15 != 3) {
                        com.bumptech.glide.c.b0(readInt6, parcel);
                    } else {
                        j10 = com.bumptech.glide.c.S(readInt6, parcel);
                    }
                }
                com.bumptech.glide.c.y(d07, parcel);
                return new d(i18, j10, str4);
            case 7:
                int d08 = com.bumptech.glide.c.d0(parcel);
                boolean z8 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                String str5 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < d08) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str5 = com.bumptech.glide.c.r(readInt7, parcel);
                            break;
                        case 2:
                            z8 = com.bumptech.glide.c.M(readInt7, parcel);
                            break;
                        case 3:
                            z10 = com.bumptech.glide.c.M(readInt7, parcel);
                            break;
                        case 4:
                            iBinder = com.bumptech.glide.c.P(readInt7, parcel);
                            break;
                        case 5:
                            z11 = com.bumptech.glide.c.M(readInt7, parcel);
                            break;
                        case 6:
                            z12 = com.bumptech.glide.c.M(readInt7, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.b0(readInt7, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.y(d08, parcel);
                return new r(str5, z8, z10, iBinder, z11, z12);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                int d09 = com.bumptech.glide.c.d0(parcel);
                boolean z13 = false;
                int i19 = 0;
                String str6 = null;
                int i20 = 0;
                while (parcel.dataPosition() < d09) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 == 1) {
                        z13 = com.bumptech.glide.c.M(readInt8, parcel);
                    } else if (c16 == 2) {
                        str6 = com.bumptech.glide.c.r(readInt8, parcel);
                    } else if (c16 == 3) {
                        i20 = com.bumptech.glide.c.Q(readInt8, parcel);
                    } else if (c16 != 4) {
                        com.bumptech.glide.c.b0(readInt8, parcel);
                    } else {
                        i19 = com.bumptech.glide.c.Q(readInt8, parcel);
                    }
                }
                com.bumptech.glide.c.y(d09, parcel);
                return new s(i20, i19, str6, z13);
            case 9:
                int d010 = com.bumptech.glide.c.d0(parcel);
                boolean z14 = false;
                String str7 = null;
                IBinder iBinder2 = null;
                boolean z15 = false;
                while (parcel.dataPosition() < d010) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 == 1) {
                        str7 = com.bumptech.glide.c.r(readInt9, parcel);
                    } else if (c17 == 2) {
                        iBinder2 = com.bumptech.glide.c.P(readInt9, parcel);
                    } else if (c17 == 3) {
                        z14 = com.bumptech.glide.c.M(readInt9, parcel);
                    } else if (c17 != 4) {
                        com.bumptech.glide.c.b0(readInt9, parcel);
                    } else {
                        z15 = com.bumptech.glide.c.M(readInt9, parcel);
                    }
                }
                com.bumptech.glide.c.y(d010, parcel);
                return new t(str7, iBinder2, z14, z15);
            case 10:
                String readString = parcel.readString();
                readString.getClass();
                return new G4.a(parcel.readInt(), readString);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ?? obj = new Object();
                obj.f4569a = parcel.readInt();
                obj.f4570b = parcel.readInt();
                obj.f4571c = parcel.readInt() == 1;
                return obj;
            case 12:
                ?? obj2 = new Object();
                obj2.f4764a = parcel.readInt();
                obj2.f4765b = parcel.readInt();
                obj2.f4767d = parcel.readInt() == 1;
                int readInt10 = parcel.readInt();
                if (readInt10 > 0) {
                    int[] iArr = new int[readInt10];
                    obj2.f4766c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj2;
            case 13:
                ?? obj3 = new Object();
                obj3.f4773a = parcel.readInt();
                obj3.f4774b = parcel.readInt();
                int readInt11 = parcel.readInt();
                obj3.f4775c = readInt11;
                if (readInt11 > 0) {
                    int[] iArr2 = new int[readInt11];
                    obj3.f4776d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt12 = parcel.readInt();
                obj3.f4777e = readInt12;
                if (readInt12 > 0) {
                    int[] iArr3 = new int[readInt12];
                    obj3.f4778f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj3.f4780v = parcel.readInt() == 1;
                obj3.f4781w = parcel.readInt() == 1;
                obj3.f4782x = parcel.readInt() == 1;
                obj3.f4779u = parcel.readArrayList(o0.class.getClassLoader());
                return obj3;
            case 14:
                return new H4.a(parcel);
            case 15:
                return new I4.a(parcel);
            case 16:
                return new I4.b(parcel);
            case 17:
                return new J4.b(parcel);
            case 18:
                return new J4.c(parcel);
            case 19:
                int d011 = com.bumptech.glide.c.d0(parcel);
                J5.a aVar = null;
                int i21 = 0;
                while (parcel.dataPosition() < d011) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 == 1) {
                        i21 = com.bumptech.glide.c.Q(readInt13, parcel);
                    } else if (c18 != 2) {
                        com.bumptech.glide.c.b0(readInt13, parcel);
                    } else {
                        aVar = (J5.a) com.bumptech.glide.c.q(parcel, readInt13, J5.a.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d011, parcel);
                return new J5.b(i21, aVar);
            case 20:
                int d012 = com.bumptech.glide.c.d0(parcel);
                ArrayList arrayList = null;
                int i22 = 0;
                while (parcel.dataPosition() < d012) {
                    int readInt14 = parcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 == 1) {
                        i22 = com.bumptech.glide.c.Q(readInt14, parcel);
                    } else if (c19 != 2) {
                        com.bumptech.glide.c.b0(readInt14, parcel);
                    } else {
                        arrayList = com.bumptech.glide.c.v(parcel, readInt14, J5.c.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d012, parcel);
                return new J5.a(i22, arrayList);
            case 21:
                int d013 = com.bumptech.glide.c.d0(parcel);
                int i23 = 0;
                String str8 = null;
                int i24 = 0;
                while (parcel.dataPosition() < d013) {
                    int readInt15 = parcel.readInt();
                    char c20 = (char) readInt15;
                    if (c20 == 1) {
                        i23 = com.bumptech.glide.c.Q(readInt15, parcel);
                    } else if (c20 == 2) {
                        str8 = com.bumptech.glide.c.r(readInt15, parcel);
                    } else if (c20 != 3) {
                        com.bumptech.glide.c.b0(readInt15, parcel);
                    } else {
                        i24 = com.bumptech.glide.c.Q(readInt15, parcel);
                    }
                }
                com.bumptech.glide.c.y(d013, parcel);
                return new J5.c(i23, str8, i24);
            case 22:
                l.e(parcel, "parcel");
                return new Jc.a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                return new K4.a(parcel);
            case 24:
                return new K4.b(parcel);
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new K4.c(parcel);
            case 26:
                return new K4.d(parcel);
            case 27:
                return new e(parcel);
            case 28:
                return new f(parcel);
            default:
                return new k(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f2111a) {
            case 0:
                return new a[i7];
            case 1:
                return new b[i7];
            case 2:
                return new h[i7];
            case 3:
                return new D5.a[i7];
            case 4:
                return new SignInConfiguration[i7];
            case 5:
                return new F5.b[i7];
            case 6:
                return new d[i7];
            case 7:
                return new r[i7];
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return new s[i7];
            case 9:
                return new t[i7];
            case 10:
                return new G4.a[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new A[i7];
            case 12:
                return new o0[i7];
            case 13:
                return new p0[i7];
            case 14:
                return new H4.a[i7];
            case 15:
                return new I4.a[i7];
            case 16:
                return new I4.b[i7];
            case 17:
                return new J4.b[i7];
            case 18:
                return new J4.c[i7];
            case 19:
                return new J5.b[i7];
            case 20:
                return new J5.a[i7];
            case 21:
                return new J5.c[i7];
            case 22:
                return new Jc.a[i7];
            case 23:
                return new K4.a[i7];
            case 24:
                return new K4.b[i7];
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new K4.c[i7];
            case 26:
                return new K4.d[i7];
            case 27:
                return new e[i7];
            case 28:
                return new f[i7];
            default:
                return new k[i7];
        }
    }
}
