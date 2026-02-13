package U5;

import W1.C0559b;
import W1.C0560c;
import Y5.A1;
import Y5.B1;
import Y5.C0606d;
import Y5.C0609e;
import Y5.C0621i;
import Y5.C0648s;
import Y5.C1;
import Y5.K1;
import Y5.O1;
import Y5.x1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.kt.apps.core.utils.blurry.BlurFactor;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9739a;

    public /* synthetic */ a0(int i7) {
        this.f9739a = i7;
    }

    public static void a(C0648s c0648s, Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 2, c0648s.f11929a, false);
        com.bumptech.glide.d.G(parcel, 3, c0648s.f11930b, i7, false);
        com.bumptech.glide.d.H(parcel, 4, c0648s.f11931c, false);
        com.bumptech.glide.d.O(parcel, 5, 8);
        parcel.writeLong(c0648s.f11932d);
        com.bumptech.glide.d.N(M3, parcel);
    }

    public static void b(K1 k12, Parcel parcel) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(k12.f11428a);
        com.bumptech.glide.d.H(parcel, 2, k12.f11429b, false);
        com.bumptech.glide.d.O(parcel, 3, 8);
        parcel.writeLong(k12.f11430c);
        com.bumptech.glide.d.F(parcel, 4, k12.f11431d);
        com.bumptech.glide.d.H(parcel, 6, k12.f11432e, false);
        com.bumptech.glide.d.H(parcel, 7, k12.f11433f, false);
        com.bumptech.glide.d.B(parcel, 8, k12.f11434u);
        com.bumptech.glide.d.N(M3, parcel);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 680
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r53) {
        /*
            Method dump skipped, instructions count: 2154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.a0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f9739a) {
            case 0:
                return new Z[i7];
            case 1:
                return new b0[i7];
            case 2:
                return new c0[i7];
            case 3:
                return new EnumC0552u[i7];
            case 4:
                return new C0553v[i7];
            case 5:
                return new Ua.b[i7];
            case 6:
                return new V5.a[i7];
            case 7:
                return new V5.c[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new V5.d[i7];
            case 9:
                return new V5.f[i7];
            case 10:
                return new V5.g[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new RegisterRequestParams[i7];
            case 12:
                return new V5.h[i7];
            case 13:
                return new SignRequestParams[i7];
            case 14:
                return new C0559b[i7];
            case 15:
                return new C0560c[i7];
            case 16:
                return new W1.P[i7];
            case 17:
                return new W1.V[i7];
            case 18:
                return new W1.Z[i7];
            case 19:
                return new C0606d[i7];
            case 20:
                return new C0609e[i7];
            case 21:
                return new C0621i[i7];
            case 22:
                return new Y5.r[i7];
            case 23:
                return new C0648s[i7];
            case 24:
                return new x1[i7];
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new A1[i7];
            case 26:
                return new B1[i7];
            case 27:
                return new C1[i7];
            case 28:
                return new K1[i7];
            default:
                return new O1[i7];
        }
    }
}
