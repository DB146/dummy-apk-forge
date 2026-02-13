package ma;

import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import n7.B;
import n7.C1710a;
import n7.C1713d;
import n7.C1714e;
import n7.E;
import n7.F;
import n7.n;
import n7.o;
import n7.r;
import n7.s;
import n7.v;
import n7.w;
import n7.y;
import n7.z;
import o.J;
import p4.C1848a;
import p4.C1849b;
import q5.C1893d;
import q5.C1895f;
import r4.C1935g;
import r4.C1936h;
import u5.C2111c;
import u5.C2112d;
import v5.C2142a;
import v5.C2143b;
import v5.C2144c;
import y5.C2389b;

/* renamed from: ma.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1654e implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20829a;

    public /* synthetic */ C1654e(int i7) {
        this.f20829a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 572
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C1654e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f20829a) {
            case 0:
                return new f[i7];
            case 1:
                return new g[i7];
            case 2:
                return new n[i7];
            case 3:
                return new o[i7];
            case 4:
                return new E[i7];
            case 5:
                return new r[i7];
            case 6:
                return new v[i7];
            case 7:
                return new w[i7];
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new y[i7];
            case 9:
                return new z[i7];
            case 10:
                return new B[i7];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new C1710a[i7];
            case 12:
                return new s[i7];
            case 13:
                return new F[i7];
            case 14:
                return new C1713d[i7];
            case 15:
                return new C1714e[i7];
            case 16:
                return new J[i7];
            case 17:
                return new C1848a[i7];
            case 18:
                return new C1849b[i7];
            case 19:
                return new C1893d[i7];
            case 20:
                return new C1895f[i7];
            case 21:
                return new C1936h[i7];
            case 22:
                return new C1935g[i7];
            case 23:
                return new r8.n[i7];
            case 24:
                return new C2111c[i7];
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new C2112d[i7];
            case 26:
                return new C2142a[i7];
            case 27:
                return new C2143b[i7];
            case 28:
                return new C2144c[i7];
            default:
                return new C2389b[i7];
        }
    }
}
