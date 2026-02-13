package U5;

import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;

/* loaded from: classes.dex */
public final class T implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9727a;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 639
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.T.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f9727a) {
            case 0:
                return new S[i7];
            case 1:
                return new U[i7];
            case 2:
                return new C0556y[i7];
            case 3:
                return new C0555x[i7];
            case 4:
                return new C0557z[i7];
            case 5:
                return new A[i7];
            case 6:
                return new B[i7];
            case 7:
                return new C[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new E[i7];
            case 9:
                return new F[i7];
            case 10:
                return new I[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new J[i7];
            case 12:
                return new L[i7];
            case 13:
                return new M[i7];
            case 14:
                return new W[i7];
            case 15:
                return new N[i7];
            case 16:
                return new EnumC0537e[i7];
            case 17:
                return new O[i7];
            case 18:
                return new C0539g[i7];
            case 19:
                return new C0538f[i7];
            case 20:
                return new C0540h[i7];
            case 21:
                return new X[i7];
            case 22:
                return new Y[i7];
            case 23:
                return new C0541i[i7];
            case 24:
                return new C0542j[i7];
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new C0543k[i7];
            case 26:
                return new C0545m[i7];
            case 27:
                return new C0546n[i7];
            case 28:
                return new C0547o[i7];
            default:
                return new r[i7];
        }
    }
}
